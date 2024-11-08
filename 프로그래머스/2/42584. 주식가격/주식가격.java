class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];  // 결과를 담을 배열
        
        for (int i = 0; i < prices.length; i++) {
            int result = 0;  // 가격이 떨어지지 않은 시간을 기록할 변수
            for (int j = i + 1; j < prices.length; j++) {
                result++;  // 가격이 떨어지지 않는 기간을 1초씩 증가
                if (prices[i] > prices[j]) {  // 가격이 떨어지면 그 시점에서 멈춤
                    break;
                }
            }
            answer[i] = result;  // 해당 시점에 떨어지지 않은 시간 기록
        }
        
        return answer;  // 결과 배열 반환
    }
}
