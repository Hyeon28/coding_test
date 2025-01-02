import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 숫자들을 문자열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        //두개 숫자들을 합친 수를 비교하여 합쳤을때 더 큰게 앞으로 가게 정렬
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String num : strNumbers) {
            sb.append(num);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
