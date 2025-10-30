import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        //<----brute force--->

        // with division operator
        // what we will do is take product of all the elements
        // of an array store it in a variable then
        // iterate the array and divide the product with each
        // and every element.

        // without division operator O(n**2)
        // here we take two pointers i,j for each i
        // we can calculate the product of all the elements
        // other than i . then increment i

        // <-----optimal approach----->

        // for every i calculate the left product and the
        // right product or the prefix and suffix for every i.

        // with the help of backward loop leftProduct is calculated
        // leftProduct[n-1] = 1
        // leftProduct[i] = leftProduct[i+1]*nums[i+1]

        // with the help of forward loop rightProduct is calculated
        // rightProduct[0] = 1
        // rightProduct[i] = rightProduct[i-1] * nums[i-1]

        // ans at index i will be rightProduct[i] * leftProduct[i].

        // 1) prefix(i) O(n)
        // 2) suffix(i) O(n)
        // 3) loop -> ans. O(n)
        // here space complexity is not optimised

        // to optimise space we do not need to store it in an
        // array, we just have to multiply it in the answer.

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(nums)));
    }
    public  static  int[] productOfArrayExceptSelf(int[]arr){
        int n = arr.length;
        int[] ans = new int[n];
//        for(int i= 0;i<n;i++){
//
//            for (int j = 0; j < n; j++) {
//                if(i!=j){
//                    ans[i] *=arr[j];
//                }
//
//            }
//        }
//        return ans;

        ans[0] =1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * arr[i-1];

        }
        int suffix = 1;
        for (int i = n-2; i >=0 ; i--) {
            suffix *= arr[i+1];
            ans[i] = ans[i]*suffix;

        }

        return ans;
    }
}
