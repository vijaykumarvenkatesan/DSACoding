package Arrays;

public class missing_in_array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        // xor operation
        int xor =0;
        for(int i:arr) xor^=i;
        for(int i=1; i<=arr.length+1;i++) xor^=i;
//        return xor;

//        using the sum method
        int total =0;
        for(int i:arr)total+=i; // calculating the sum of the numbers in the array
        int n =0;
        for(int i=1;i<=arr.length+1;i++)n+=i; // calculating the sum of the
//        return n-total;
    }
}
