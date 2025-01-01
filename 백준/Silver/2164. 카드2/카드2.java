import java.util.*;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         Queue<Integer> q = new LinkedList<>();
        
         for(int i = 1; i<=num; i++){
             q.add(i);
         }
         
         while(q.size() != 1){
             q.remove();
             int first = q.peek();
             q.add(first);
             q.remove();
         }
         
         System.out.print(q.peek());
                 
     } 
}