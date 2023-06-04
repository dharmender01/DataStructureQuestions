package Array;

public class Reverse_Array {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        reverse(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
