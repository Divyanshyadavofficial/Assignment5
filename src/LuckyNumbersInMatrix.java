import java.util.ArrayList;

public class LuckyNumbersInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(mat));
    }
    static ArrayList<Integer>luckyNumbers(int[][]mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;

        int colIndex = 0;
        for (int i = 0; i < n; i++) {
            int rowMin = mat[i][0];
            for (int j = 1; j < mat[i].length; j++) {

                if (mat[i][j] < rowMin) {
                    rowMin = mat[i][j];
                    colIndex = j;
                }
            }
            boolean isMax = true;
            for (int k = 0; k < n; k++) {
                if (mat[k][colIndex] > rowMin) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                ans.add(rowMin);
            }
        }


        return ans;
    }
}


