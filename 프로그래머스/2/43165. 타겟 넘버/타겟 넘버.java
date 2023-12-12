import java.util.Queue;
import java.util.LinkedList;

class Solution {    
    public int solution(int [] numbers, int target){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        for (int i = 0; i < numbers.length; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int sum = queue.poll();
                queue.offer(sum + numbers[i]);
                queue.offer(sum - numbers[i]);
            }

        }
        while(!queue.isEmpty()){
            int ans = queue.poll();
            if(ans == target) answer ++;
        }
        return answer;
    }
}