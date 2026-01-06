import java.util.ArrayList;
import java.util.Scanner;

public class day12 {
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         int ballon = in.nextInt();
         int player = in.nextInt();
         ArrayList<Integer> ballons = new ArrayList<>();
         int[] players = new int[player];
         for(int i=0; i<ballon;i++){
             ballons.add(in.nextInt());
         }
         for(int i=0; i<player;i++){
             players[i]=in.nextInt();
         }
         for(int i=0; i<player;i++){
             for(int j=ballons.size()-1; j>=0; j--){
                 if(ballons.get(j)%players[i]==0) ballons.remove(j);
             }
         }
         for(int i:ballons) System.out.print(i+" ");
         if(ballons.size() == ballon || ballons.size() ==0) System.out.print("-1");
     }
}
