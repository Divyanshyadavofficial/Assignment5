import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
        System.out.println(Arrays.deepToString(reshape(mat, r, c)));
    }
    public static int[][] reshape(int[][]mat,int r,int c){
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = 0;
        if(m*n!=r*c){
            return mat;
        }
        int[][]ans = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }

        }

        return ans;
    }
}
// you need to flatten the old matrix row by row
// and then refill into the new shape