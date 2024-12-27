import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //개수
        int M = sc.nextInt(); //횟수
        //합 배열 생성
        int sum_array[] = new int[N+1];
        int sum = 0;

        for(int i = 1; i < N+1; i++){
            sum += sc.nextInt();
            sum_array[i] = sum;
        }

        for(int c = 0; c < M; c++){
        
            int i = sc.nextInt();
            int j = sc.nextInt();

            int answer = sum_array[j] - sum_array[i - 1];
            System.out.println(answer);
        }
    }
}