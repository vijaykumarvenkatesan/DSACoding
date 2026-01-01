import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder ans = new StringBuilder();
        while(n>0){
            n--;
            int rem = (int)(n%26);
            ans.append((char)('A'+rem));
            n/=26;
        }
        System.out.println(ans.reverse().toString());
    }
}
