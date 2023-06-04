package String;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean valid_parentheses(String s){
        if (s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            } else if (stack.peek() == '('  && s.charAt(i) ==')' ||
                       stack.peek() == '{'  && s.charAt(i) =='}' ||
                       stack.peek() == '['  && s.charAt(i) ==']') {
                    stack.pop();
            }else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(valid_parentheses("{}"));
    }
}
