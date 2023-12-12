import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 
        selectionSort(lost);
        selectionSort(reserve);

        List<Integer> ll = new ArrayList<>();        
        for (int num : lost) {   
            ll.add(num);
        }
        List<Integer> rl = new ArrayList<>();
        for (int num : reserve) {
            rl.add(num);
        }

      for (int i = 0; i < ll.size(); i++) {
            for (int j = 0; j < rl.size(); j++) {
                if (ll.get(i).equals(rl.get(j))) {
                    ll.remove(i);
                    rl.remove(j);
                    i--;
                    break;
                }
            }
        }
        int help = ll.size();
        if (ll.size() == 0) {
            answer = n;
        } else {
            for (int i = 0; i < ll.size(); i++) {
                for (int j = 0; j < rl.size(); j++) {
                    int a = rl.get(j);

                    if (ll.get(i) == a - 1 | ll.get(i) == a + 1) {
                        ll.remove(i);
                        rl.remove(j);
                        i--;
                        break;
                    }
                }
            }
            int borrows = help - ll.size();
            answer = n - help + borrows;
        }
        return answer;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int least = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            swap(arr, i, least);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}