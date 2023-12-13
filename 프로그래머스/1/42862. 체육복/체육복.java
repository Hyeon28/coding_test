import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 
        Arrays.sort(lost);
        Arrays.sort(reserve);

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
}