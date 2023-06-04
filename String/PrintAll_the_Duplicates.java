package String;

import java.util.HashMap;
import java.util.Map;

public class PrintAll_the_Duplicates {
    public static void printDuplicates(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : map.keySet()){
            if (map.get(ch)>1){
                System.out.println(ch+" "+ map.get(ch));
            }
        }
    }
    public static void main(String[] args) {
            printDuplicates("abdcdbaaaa");
    }
}
