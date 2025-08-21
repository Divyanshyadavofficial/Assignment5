public class FindNumbersWithEvendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i= 0;i<nums.length;i++){
            int digits = 0;
            int temp = nums[i];
            while(temp>0){
                temp=temp/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }

        }
        return count;


    }
}
