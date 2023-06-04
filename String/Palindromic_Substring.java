package String;

public class Palindromic_Substring {
    public static int palindromicSubstring(String str){
        int l = str.length();
        int count = 0;
        boolean[][] dp = new boolean[l][l];
        for (int g = 0; g < l; g++){
            for (int i = 0, j = g; j<l; i++,j++){
                if (g == 0){
                    dp[i][j] = true;
                } else if (g == 1) {
                    dp[i][j] = str.charAt(i) == str.charAt(j);
                }else {
                    if (str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }
                if(dp[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(palindromicSubstring("abaccdcca"));
    }
}
