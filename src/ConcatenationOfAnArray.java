import java.util.Arrays;

public class ConcatenationOfAnArray {
    public static void main(String[] args) {
        int[]nums = {1,2,1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] getConcatenation(int[]nums){
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
