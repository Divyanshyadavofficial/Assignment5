public class CellsWithOddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));

    }
    public static int oddCells(int m,  int n,int[][] indices){
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int[] index : indices){
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int oddValuedCells = 0;
        for (int i =0;i<m;i++){
            for (int j = 0; j < n; j++) {
                if((rows[i]+cols[j]%2==1)){
                    oddValuedCells++;
                }

            }
        }
        return oddValuedCells;
    }
}
