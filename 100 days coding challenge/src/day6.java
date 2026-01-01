import java.util.*;
public class day6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();
        
         while(in.hasNextInt()){
             list.add(in.nextInt());
         }
        
         StringBuilder ans = new StringBuilder();
         int max = list.get(list.size()-1);
         ans.append(max).append(" ");
         for(int i=list.size()-2; i>=0;i--){
             if(list.get(i) > max){
                 max = list.get(i);
                 ans.insert(0,max+" ");
             }
         }
         System.out.println(ans.toString().trim());
    }
}
