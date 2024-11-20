import java.util.Stack;
import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for(char c: chars)
        {
            if( c == '(')
            {
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                {
                    answer = false;            
                }else{
                    stack.pop();
                }  
            }  
        }
        if(!stack.isEmpty()){
            answer = false;
        }
    
        return answer;
    }
}
        