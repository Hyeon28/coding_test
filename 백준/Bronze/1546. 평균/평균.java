import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int scores[] = new int[count]; //성적을 배열로 저장
        int max = 0; //최대 점수
        float avg = 0; //평균값
        
        for(int i = 0; i < count; i++){
            int score = scanner.nextInt();
            if(i == 0){ //첫번째 점수를 최대 점수로 저장
                scores[i] = score;
                max = score;
            }else{
                scores[i] = score;
                if(max < score){ //비교를 통해 최대 점수 저장
                   max = score;
                }
            }
        }
        
        for(int i = 0; i < count; i++){
            avg += (float)scores[i]/max*100; //새로운 점수을 합해서 저장, 계산 시 float으로 변환
        }        
        avg = avg/count; //평균 계산
        System.out.print(avg);
    
    }
}