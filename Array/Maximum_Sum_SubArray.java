package Array;

public class Maximum_Sum_SubArray {
    public static int maxSubArray(int[] arr){
        int sum = 0;
        int ans = 0;
        for (int i : arr){
            sum += i;
            if (sum<0) sum = 0;
            if (sum>ans) ans = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
