import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>(); 

        // 각 프로세스의 우선순위와 위치를 큐에 저장 ex. (1,0), (1,1) (9,2) ...
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {priorities[i], i}); // {우선순위, 인덱스}
        }

        int count = 0; //횟수
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 꺼낸 프로세스
            boolean hasHigherPriority = false;

            // 큐의 나머지 프로세스 중에서 우선순위가 더 높은 것이 있는지 확인
            for (int[] process : queue) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 더 높은 우선순위가 있으면 뒤로 넣기
                queue.offer(current);
            } else {
                // 실행
                count++;
                if (current[1] == location) { // current[1]이 location과 같으면
                    answer = count; // location의 프로세스가 실행되면 종료
                    break;
                }
            }
        }

        return answer;
    }
}
