import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
//
//    what we have to do is we have to rotate the array k
//    times i.e. {1,2,3,4,5,6,7} and k=3
//    the array will become {5,6,7,1,2,3,4}

//    what we have to here is ---
//    first we reverse the whole array till.(0-n-1)
//    then we reverse till (0,k-1).
//    after that reverse till (k,n-1)
//    then return the output

//    if k is greater than array length
//    rev(0,n-1)
//    rev(0,k-1)
//    rev(k,n-1) it will fail in this case and raise out of
//    bound error
//    therefore we do not take k = k, here we take k = k%n
//    that will not raise out of bound error.
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        return arr;

    }

}
