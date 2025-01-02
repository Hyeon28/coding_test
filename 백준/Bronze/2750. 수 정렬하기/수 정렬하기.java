import java.util.*;

public class Main {
    public static void main(String[] args) {
        //array.sort가 아닌 정렬을 통해서 해결
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int nums[] = new int[count];

        for(int i = 0; i<count; i++){
            nums[i] = sc.nextInt(); 
        }

        for(int i = 0; i<count-1; i++) {
            boolean swap = false; //swap이 없는 경우 바로 break

            for(int j = 0; j<count-1-i; j++) {
                int a = nums[j];
                int b = nums[j + 1];
                if (a > b) { //앞 숫자가 더 큰 경우 두 숫자의 위치를 swap
                    nums[j] = b;
                    nums[j+1] = a;
                    swap = true;
                }
            }
            if(!swap) break;
        }

        for(int i = 0; i<count; i++){
            System.out.println(nums[i]);
        }
    }
}