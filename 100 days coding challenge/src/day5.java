import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int sum=0;
         if(n>999999){
             int num = n-999999;
             sum+=(num*7);
             n-=num;
         }
         if(n>99999){
             int num = n-99999;
             sum+=(num*6);
             n-=num;
         }
         if(n>9999){
             int num = n-9999;
             sum+=(num*5);
             n-=num;
         }
         if(n>999){
             int num = n-999;
             sum+=(num*4);
             n-=num;
         }
         if(n>999){
             int num = n-999;
             sum+=(num*4);
             n-=num;
         }
         if(n>99){
             int num = n-99;
             sum+=(num*3);
             n-=num;
         }
         if(n>9){
             int num = n-9;
             sum+=(num*2);
             n-=num;
         }
         sum+=n;
         System.out.println(sum);
    }
}
