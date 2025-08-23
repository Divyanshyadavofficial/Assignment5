import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int k= 23;
        int[] nums = {1,2,3};
        System.out.println((ArrayForm(k, nums)));
    }
    static List<Integer> ArrayForm(int k, int[]nums){
        LinkedList<Integer>result = new LinkedList<>();
        int i = nums.length-1;
        int carry =0;
        while(i>=0||carry>0||k>0){
            int digitNum = (i>=0)?nums[i]:0;
            int digitK = k%10;
            int sum = digitK+digitNum;
            result.addFirst(sum%10);
            carry= sum/10;
            k/=10;
            i--;
        }
        return result;
    }
}
