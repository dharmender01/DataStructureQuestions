package Array;

public class Container_With_MostWater {
    public static void main(String[] args) {
        System.out.println(container_With_MostWater(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int container_With_MostWater(int[] height) {
        int left = 0;
        int right = height.length-1;
        int total = 0;
        while (left<right) {
            total = Math.max(total,Math.min(height[left], height[right])*(right-left));
            if (height[left]<height[right]){
                left++;
            }else right--;
        }
        return total;
    }
}
