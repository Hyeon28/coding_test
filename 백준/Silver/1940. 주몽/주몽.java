import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int nums[] = new int[N];
        int count = 0;
        
        for(int i = 0; i<N; i++){
            nums[i] = sc.nextInt();
        }
        
        //투포인터 사용을 위해 정렬
        Arrays.sort(nums);
        //시작 끝 지정
        int start = 0;
        int end = N-1;
        
        while(start<end){
            int sum = nums[start]+nums[end];
            
            if(sum < M){
                start++;
            }else if(sum > M){
                end--;
            }else{
                count++;
                start++;
                end--;
            }
        }
        System.out.print(count);
    }
}