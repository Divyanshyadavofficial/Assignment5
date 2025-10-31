public class JumpGame {
    public static void main(String[] args) {
        // here we iterate the array indexes and checks
        // for a particular index can we reach to the max
        // index for every index we reach we updates the value
        // of max index and if the value of max index is equal
        // to last index we return  true
        // if the value of i is less than the max index then
        // we return false...
        int[] arr = {2,3,1,1,4};
        System.out.println(Isjump(arr));
    }
    static boolean Isjump(int[]arr){
        int MaxIndex = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(i>MaxIndex) return false;
            MaxIndex = Math.max(MaxIndex,i+arr[i]);

        }
        return true;
    }
}
