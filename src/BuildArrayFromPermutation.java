import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int[] result = sol(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] sol(int[]nums){
        int [] ans = new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
