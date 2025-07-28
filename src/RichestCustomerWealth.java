import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(MaxWealth(accounts));
    }
    static int MaxWealth(int[][]accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int s = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                s = s+(accounts[i][j]);
            }
            if(s>max){
                max=s;
            }

        }
        return max;
    }
}
