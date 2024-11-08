class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; 

        for (int i = 0; i < prices.length - 1; i++) {  
            int result = 0;  
            for (int j = i + 1; j < prices.length; j++) {
                result++; 
                if (prices[i] > prices[j]) {  
                    break;
                }
            }
            answer[i] = result; 
        }

        answer[prices.length - 1] = 0;  

        return answer; 
    }
}
