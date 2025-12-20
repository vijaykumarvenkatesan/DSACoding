import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
        }
//        for(int i:arr) System.out.print(i+" ");
        int k = in.nextInt();

//        for(int i=0; i<=n-k;i++){
//            int max = arr[i];
//            for(int j=i+1; j<i+k;j++){
//                if(arr[j]>max) max=arr[j];
//            }
//            System.out.print(max+" ");
//        }

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst()<=i-k) deque.pollFirst();
            while(!deque.isEmpty() && arr[deque.peekLast()] <arr[i]) deque.pollLast();
            deque.offerLast(i);
            if(i>=k-1) System.out.print(arr[deque.peekFirst()]+" ");

        }
    }
}
