package String;

public class ReverseWordWise {
    public static String reverse(String str){
        String ans = "";
        int i = str.length();
        int j;
        for (j = i-1; j >= 0; j--) {
            if (str.charAt(j)==' ') {
                ans += (str.substring(j+1,i)+" ");
                i=j;
            }
        }
        return ans + str.substring(0,i);
    }
    public static void main(String[] args) {
        String result = reverse("May the world be with you");
        System.out.println(result);
    }
}
