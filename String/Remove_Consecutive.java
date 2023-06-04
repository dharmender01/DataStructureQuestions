package String;

public class Remove_Consecutive {
    public static String remove_consecutive(String str){
        if(str.length() <=1) return str;
        if (str.charAt(0) == str.charAt(1)){
            return remove_consecutive(str.substring(1));
        }else{
            return   str.charAt(0)+remove_consecutive(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(remove_consecutive("aabbcc"));
    }
}
