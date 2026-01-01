import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n;i++) arr[i] = in.nextInt();
         int counter=0;
         for(int i:arr){
             if(i == 1){
                 counter++;
                 System.out.print(i+" ");
                 if(counter == k){
                     System.out.print(0+" ");
                     counter=0;
                 }
                
             }
             else{
                     System.out.print(i+" ");
                     counter=0;
                 }
         }
    }
}
