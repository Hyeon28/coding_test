import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        int count = 1;
        //start, end index 설정
        int start = 1;
        int end = 1;
        
        //end가 입력 받은 수보다 작을 동안 반복
        while(end < num){
            if(sum == num){
                end++;
                sum += end;
                count++;
            }else if(sum < num){
                end++;
                sum+=end;
            }else{
                sum-=start;
                start++;
            }
        }
        
        System.out.print(count);
    }
}