package Array;

import java.util.Arrays;

public class Chocolate_Distribution {
    public static int chocolate_dist(int[] arr, int m){
        if (m == 0)return -1;
        if (m>arr.length) return -1;
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i+m-1< arr.length; i++){
            int diff = arr[i+m-1]-arr[i];
            if (diff<min_diff) min_diff = diff;
        }
        return min_diff;
    }
    public static void main(String[] args) {
        System.out.println(chocolate_dist(new int[]{12, 4,  7,  9,  2,  23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50 },7));
    }
}
