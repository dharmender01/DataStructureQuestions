package Array;

public class Product_Array_Expect_Self {
    public  static  int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            ans[i]=prod;
            prod*=arr[i];
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=prod;
            prod*=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = productExceptSelf(new int[]{1,2,3,4,5});
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
