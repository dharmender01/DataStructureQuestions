package Array;
import java.util.*;

public class Contains_Duplicates {
    public static boolean containsDuplicate(int[] nums) {
        // if(nums.length == 1) return false;
        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i])>1)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
