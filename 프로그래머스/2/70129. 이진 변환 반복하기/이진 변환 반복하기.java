import java.util.*; 

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zerocount = 0;
        int process = 0;
        while(!s.equals("1")){
            StringBuilder newline = new StringBuilder();
            for(char c: s.toCharArray()){
                if(c == '0'){
                    zerocount++;
                }else {
                    newline.append(c);
                }
            }
            s = newline.toString();
            s = Integer.toBinaryString(s.length());
            process++;
        }   
        answer[1] = zerocount;
        answer[0] = process;
        return answer;
    }
}