import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        // 입력이 더 이상 없을 때까지 계속 받기
        while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
            int num = Integer.parseInt(line);
            numbers.add(num);
            sum += num;
        }

        // 평균 계산
        int average = sum / numbers.size();

        // 중앙값 계산
        Collections.sort(numbers);
        int median = numbers.get(numbers.size() / 2);

        // 출력
        System.out.println(average);
        System.out.println(median);
        
        br.close();
    }
}
