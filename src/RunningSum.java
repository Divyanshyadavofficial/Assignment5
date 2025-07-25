import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = Runningsum(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] Runningsum(int[]nums){
        for(int i =1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
