import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>(); 
        Queue<Integer> q = new LinkedList<>(); // 완료 일수를 저장할 큐

        // 완료 일수를 계산해서 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            //소숫점 계산 올림처리
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.add(days);
        }

        while (!q.isEmpty()) {
            int standard = q.poll(); // 가장 첫번째 작업의 완료 일수
            int count = 1;

            // 첫번째 완료 일수와 같거나 작은 작업들은 함께 배포
            while (!q.isEmpty() && q.peek() <= standard) {
                count++;
                q.poll();
            }

            // 결과 리스트에 추가
            result.add(count);
        }

        // ArrayList를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
