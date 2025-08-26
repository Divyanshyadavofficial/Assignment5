import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(nunique(n)));
    }
    private static int[] nunique(int n){
        int[] ans = new int[n];
        int idx = 0;
        if(n%2==1){
            ans[idx++] = 0;
        }
        for (int i = 1;idx< n; i++) {
            ans[idx++]= -i;
            ans[idx++] = i;

        }
        return ans;
    }
}
