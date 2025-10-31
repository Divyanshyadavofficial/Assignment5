public class FirstAndLastPosInSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] result = find(arr,target);
        System.out.println("[" + result[0] + ", " + result[1]+ "]");
    }
    static int[] find(int[]arr,int target){
        int first = findFirst(arr,target);
        int last = findLast(arr,target);
        return new int[]{first,last};
    }
    static int findFirst(int[]arr,int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            } else if (arr[mid]>target) {
                end = mid-1;

            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    static int findLast(int[]arr,int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                start = mid+1;
            } else if (arr[mid]>target) {
                end = mid-1;

            }else{
                start = mid+1;
            }
        }
        return ans;
    }




}
