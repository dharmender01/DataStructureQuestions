package Array;

public class MIn_Max_in_Array {
    public static void minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i<min) min = i;
            if (i>max) max = i;
        }
        System.out.println("min "+min +" " + "max "+max);
    }
    public static void main(String[] args) {
        minElement(new int[]{1,8,4,5,6,8,7,51,44});
    }
}
