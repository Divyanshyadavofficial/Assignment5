import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums ={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums)));

    }
    static int[] shuffle(int[]nums){
        int n = nums.length/2;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];

        }
        return result;
    }
}
