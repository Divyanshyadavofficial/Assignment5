import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] nums = {5,2,3,4};
        int target = 7;
        System.out.println(Arrays.toString(twosum(nums, target)));
    }
    public static int[] twosum(int[]nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}
