package String;

public class Valid_Palindrome {
    public static boolean isValid(String input){
        String str = input.toLowerCase();
        String s = "";
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                s += ch;
            }
        }
        for (int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isValid("race a car"));
    }
}
