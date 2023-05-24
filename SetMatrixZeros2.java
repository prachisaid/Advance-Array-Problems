import java.util.Arrays;

public class SetMatrixZeros2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setMatrix(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));;
        }
    }

    static void setMatrix(int[][] arr){
        int[] rows = new int[arr.length];
        int[] cols = new int[arr.length];

        
        System.out.println(Arrays.toString(cols));
        System.out.println(Arrays.toString(rows) + "\n oo");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 0){
                    rows[row] = -1;
                    cols[col] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(cols));
        System.out.println(Arrays.toString(rows) + "\n oo");

        for (int i = 0; i < rows.length; i++) {
            if(rows[i] == -1){
                changeArrayTempRow(arr, i);
            }
        }

        for (int i = 0; i < cols.length; i++) {
            if(cols[i] == -1){
                changeArrayTempCol(arr, i);
            }
        }
    }

    private static void changeArrayTempRow(int[][] arr, int row) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = row; j <= row; j++) {
                arr[j][i] = 0;
            }
        }
    }

    private static void changeArrayTempCol(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = col; j <= col; j++) {
                arr[i][j] = 0;
            }
        }
    }

}
