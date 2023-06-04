package String;

public class Longest_Palindromic_substring {
    public static String longest_palindromic_substring(String str){
        int len = str.length();
        if(len == 0) return str;
        String ans = "";
        boolean[][] dp = new boolean[len][len];
        for (int g = 0; g<len; g++){
            for (int i = 0,j = g; j<len;  i++,j++) {
                if (g == 0) dp[i][j] = true;
                else if (g == 1 && str.charAt(i) == str.charAt(i + 1)) {
                    dp[i][j] = true;
                } else {
                    if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j]) {
                    ans = str.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longest_palindromic_substring("dharmrahd"));
    }
}
