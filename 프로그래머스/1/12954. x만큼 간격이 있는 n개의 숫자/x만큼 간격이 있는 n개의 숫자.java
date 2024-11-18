class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] =  (long) (i + 1) * x; // x를 계속 더해가며 값을 초기화
        }
        
        return answer;
    }
}