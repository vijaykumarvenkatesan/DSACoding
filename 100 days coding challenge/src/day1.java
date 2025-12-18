import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        for(int i=0; i<=n-k;i++){
            int max = arr[i];
            for(int j=i+1; j<i+k;j++){
                if(arr[i]>max) max=arr[i];
            }
            System.out.print(max+" ");
        }
    }
}
