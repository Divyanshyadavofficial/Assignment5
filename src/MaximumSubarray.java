public class MaximumSubarray {
    public static void main(String[] args) {
        //kadane's algorithm
//        As we go through the array, keep track of
//        the maximum sum subarray ending at the
//        current index.
//                At each step, we decide:
//        Should we extend the previous subarray by
//        including the current element?
//        Or should we start a new subarray
//        at the current element?
//        This way, we only need one pass


        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsum(nums));
    }

    private static int maxsum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
