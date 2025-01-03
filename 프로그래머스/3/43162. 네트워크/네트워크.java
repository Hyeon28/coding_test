import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                stack.push(i);
                answer++;
            }
            while (!stack.isEmpty()) {
                int arr[] = computers[stack.lastElement()];
                int stacksize = stack.size();
                for (int j = 0; j < arr.length; j++) {
                    if(i==j){
                    }else if(arr[j] == 1) {
                        if (!visited[j]) {
                            stack.push(j);
                            visited[j] = true;
                            break;
                        }
                    }
                }
                if(stacksize == stack.size()){ //아무것도 push가 되지 않은 경우
                    stack.pop();
                }
            }
        }
        System.out.println(answer);


        return answer;


    }
}