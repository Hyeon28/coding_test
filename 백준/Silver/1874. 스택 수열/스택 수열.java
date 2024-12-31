import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int nums[] = new int[count];
        boolean makeable = true; //수열 생성 가능 여부


        //수열 배열 생성
        for(int i = 0; i<count; i++){
            nums[i] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder(); //정답 출력 저장용
        Stack<Integer> stack = new Stack<>();

        int num = 1; //증가시킬 자연수
        for(int i = 0; i<nums.length; i++){
            int target = nums[i];
            if(target >= num){
                while(target >= num){
                    stack.push(num);
                    num++;
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            }
            else{
                int n = stack.pop();
                if(n > target) {
                    System.out.println("NO");
                    makeable = false;
                    break;
                }
                else result.append("-\n");
            }
        }
        if(makeable) System.out.print(result);
    }
}