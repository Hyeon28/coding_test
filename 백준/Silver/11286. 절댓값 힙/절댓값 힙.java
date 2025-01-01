import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        //Comparator를 사용하여 새로운 기준 설정
        PriorityQueue<Integer> pQ = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return Integer.compare(a, b); // 절댓값이 같으면 원래 값 기준 오름차순
            }
            return Integer.compare(absA, absB); // 절댓값 기준 오름차순
        });

        for(int i = 0; i<count; i++){
            int num = sc.nextInt();
            if(num == 0){ //가장 작은 절댓값을 가진 숫자 출력
                if(pQ.isEmpty()){ //큐가 비어있을 경우 0을 출력
                    System.out.println("0");
                }else {
                    System.out.println(pQ.poll()); // 가장 작은 값을 출력하고 제거
                }
            } else {
                pQ.offer(num); // num 추가
            }
        }
    }
}