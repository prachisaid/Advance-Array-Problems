import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        matrixZero(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));;
        }
    }

    static void matrixZero(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 0){
                    changeArrayTemp(arr, row, col);
                }
            }
        }

        changeArr(arr);
    }

    private static void changeArr(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == -1){
                    arr[row][col] = 0;
                }
            }
        }
    }

    private static void changeArrayTemp(int[][] arr, int row, int col) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = row; j <= row; j++) {
                if(arr[j][i] != 0){
                arr[j][i] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = col; j <= col; j++) {
                arr[i][j] = -1;
            }
        }
    }

}
