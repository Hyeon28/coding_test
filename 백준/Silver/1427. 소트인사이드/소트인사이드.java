import java.util.*;

public class Main {
    public static void main(String[] args) {
        //선택정렬을 통해서 해결
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int nums[] = new int[num.length()];

        for(int i = 0; i<num.length(); i++){
            nums[i] = Integer.parseInt(num.substring(i, i+1));
        }

        for(int i = 0; i<nums.length; i++){
            int max = i;
            for(int j = i+1; j<nums.length; j++){ //정렬된 i개를 제외한 부분에서 max 값 찾기
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            if(nums[i] < nums[max]){ //가장 앞 숫자랑 비교해서 더 클 경우 swap
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
            }

        }

        for(Integer n : nums){
            System.out.print(n);
        }
    }
}