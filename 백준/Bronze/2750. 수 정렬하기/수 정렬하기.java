import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int nums[] = new int[count];

        for(int i = 0; i<count; i++){
            nums[i] = sc.nextInt(); 
        }

        Arrays.sort(nums);
        for (Integer n : nums) 
            System.out.println(n);
    }
}