import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int mid = word.length()/2;
        String rotated =word.substring(mid)+word.substring(0,mid);
        for(int i=1; i<=word.length();i++){
            for(int star=0; star<word.length()-i;star++) System.out.print("*");
            System.out.println(rotated.substring(0,i));
        }
    }
}
