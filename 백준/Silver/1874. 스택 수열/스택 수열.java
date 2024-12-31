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
                //수열의 수가 자연수보다 크면 같아질때까지 증가시키며 stack에 push
                while(target >= num){
                    stack.push(num);
                    num++;
                    result.append("+\n");
                }
                stack.pop(); //같아지면 pop
                result.append("-\n");
            }
            else{
                int n = stack.pop(); 
                //수열의 수가 자연수보다 작을때 pop한 숫자와 수열의 수가 같지만 않으면 만들 수 없는 수열
                if(n > target) { 
                    System.out.println("NO");
                    makeable = false; //제작 불가능
                    break;
                }
                else result.append("-\n");
            }
        }
        //제작 가능한 수열만 push, pop 결과를 출력
        if(makeable) System.out.print(result);
    }
}