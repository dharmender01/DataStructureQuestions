package Array;

public class Buy_Sell_oneTime {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int price : prices) {
            if (price < min) min = price;
            if (max < price - min) {
                max = price - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
