import java.util.ArrayList;
 
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(n == 0){
            answer = 0;
        }
        else if(n == 1){
            answer = 1;
        }
        else if(n<=3000){
            list.add(1);
            list.add(n);

            for(int i = 2; i<n; i++){
                if(n % i == 0){
                    list.add(i);
                }
            }

            for(int i = 0; i<list.size(); i++){
                answer += list.get(i);
            }
        }
        return answer;
    }
}