import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String nums = scanner.next();
        //input에서 개수와 공백 없는 숫자를 받아서 각각 int, String으로 저장
    
        String[] a_nums = nums.split("");
        //String을 하나씩 분리
    
        int sum = 0; 
    
        //String array 길이만큼 반복하여 각각을 int로 변환하여 합한다
        for(int i = 0; i<a_nums.length; i++){
            int num = Integer.parseInt(a_nums[i]);
            sum += num;
        }
        System.out.print(sum);
    }    
}