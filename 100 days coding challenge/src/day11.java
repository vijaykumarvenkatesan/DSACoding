import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          String s = in.next();
          if(s.length()==0 ||s.charAt(0)=='0'){
              System.out.println("0");
              return;
          }
          int n = s.length();
          int[] dp = new int[n+1];
          dp[0]=1;
          dp[1]=1;
          for(int i=2; i<=n;i++){
              if(s.charAt(i-1)!='0') dp[i]+=dp[i-1];
              int twoDigit = Integer.parseInt(s.substring(i-2,i));
              if(twoDigit >=10 && twoDigit<=26) dp[i]+=dp[i-2];
            
          }
          System.out.println(dp[n]);
    }
}
