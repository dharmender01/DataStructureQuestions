package ArrayQues;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,5,7,4,6,8};
       int[] res =  reverse(arr);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
}
