import java.util.*;
public class day7 {
    public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         for(int i=0; i<n;i++){
             int val =i+1;
             for(int j=0;j<n-i;j++){
                 System.out.print(val+" ");
                 val+=n-j;

             }
             System.out.println();
         }
    }
}
