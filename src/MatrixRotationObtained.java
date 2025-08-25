public class MatrixRotationObtained {
    public static void main(String[] args) {

    }
    public boolean rotatedMatrix(int[][]mat,int[][]target){
        for (int k = 0; k < 4; k++) {
            if(isEqual(mat,target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
    private static boolean isEqual(int[][]a,int[][]b){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]!=b[i][j]){
                    return false;
                }

            }
        }
        return true;
    }

    private static int[][] rotate(int[][]mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-i-1] = mat[i][j];
            }

        }
        return rotated;
    }
}
