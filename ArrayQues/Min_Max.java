package ArrayQues;

 class Pair{
 int min;
 int max;
}
public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {4,7,8,5,4,9};
        Pair ans = minMax(arr);
        System.out.println(ans.min);
        System.out.println(ans.max);

    }
    public static Pair minMax(int[] arr){
        Pair res = new Pair();
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j < mini) {
                mini = j;
            }
            if (maxi < j) {
                maxi = j;
            }
        }
        res.min = mini;
        res.max = maxi;
        return res;
    }
}
