public class RemoveDuplicatesFromSortedArray {
    // here two pointer method is used
    public static void main(String[] args) {
        int[]nums = {0,1,1,2,2,3,4};
        int k = findDuplicates(nums);
        System.out.println(k);

    }
    public static int findDuplicates(int[]nums){
        if(nums.length==0){
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[fast] = nums[slow];
            }else {
                fast++;
            }
        }
        return slow +1;
    }
}
