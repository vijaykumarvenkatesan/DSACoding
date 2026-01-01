import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int predigit = n%10;
          n/=10;
          while(n>0){
              int digit = n%10;
              if(Math.abs(digit-predigit)!=1){
                  System.out.println("no");
                  return;
              }
              predigit=digit;
              n/=10;
          }
          System.out.println("yes");
    }
}
