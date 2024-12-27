import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s_length = sc.nextInt(); // 문자열의 길이
        int p_length = sc.nextInt(); // 부분 문자열의 길이
        int count = 0;

        String pw = sc.next(); // 비밀번호 문자열

        // 최소 개수 조건
        int requiredA = sc.nextInt();
        int requiredC = sc.nextInt();
        int requiredG = sc.nextInt();
        int requiredT = sc.nextInt();

        // 현재 윈도우에서 각 문자의 개수
        int currentA = 0, currentC = 0, currentG = 0, currentT = 0;

        for (int i = 0; i < s_length; i++) {
            // 윈도우 생성(문자 개수 세기)
            char added = pw.charAt(i);
            if (added == 'A') currentA++;
            else if (added == 'C') currentC++;
            else if (added == 'G') currentG++;
            else if (added == 'T') currentT++;

            // 윈도우 크기가 부분 문자열보다 크면 첫 문자 제거
            if (i >= p_length) {
                char removed = pw.charAt(i - p_length);
                if (removed == 'A') currentA--;
                else if (removed == 'C') currentC--;
                else if (removed == 'G') currentG--;
                else if (removed == 'T') currentT--;
            }

            if (i >= p_length - 1) {
                if (currentA >= requiredA && currentC >= requiredC && currentG >= requiredG && currentT >= requiredT) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
