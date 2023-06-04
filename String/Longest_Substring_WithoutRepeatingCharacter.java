package String;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_WithoutRepeatingCharacter {
    public static int longestSubstring(String str){
       // String s = "";
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        while(true) {
            boolean flag1 = false;
            boolean flag2 = false;
            // acquire until invalid
            while (i < str.length()) {
                flag1 = true;
                char ch = str.charAt(i);
                ++i;
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.get(ch) == 2) {
                    break;
                } else {
                    //String asf = str.substring(j,i);
                    int len = i - j;
//                    if (len>ans){
//                        ans = len;
//                        s = asf;
//                    }
                    ans = Math.max(ans, len);
                }
            }
            // release until valid
            while (j < i) {
                flag2 = true;
                char ch = str.charAt(j);
                ++j;
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 1) {
                    break;
                }
            }
            if (!flag1 && !flag2){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("pwwkew"));
    }
}
