import java.util.Arrays;

public class SetMatrixZeros3 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 0, 0, 1}
        };

        setMatrix(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));;
        }
    }
    static void setMatrix(int[][] arr){
        boolean colm = true;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 0){
                   if(col == 0 || row == 0 && arr.length != 1){
                    colm = false;
                   }else{
                    arr[0][col] = 0;
                    arr[row][0] = 0;
                   }
                }
            }
        }

        for (int row = arr.length-1; row >= 0; row--) {
            for (int col = arr[row].length-1; col >= 0; col--) {
                if(arr[0][col] == 0 || arr[row][0] == 0){
                    arr[row][col] = 0;
                }
            }
        }

        if(!colm){
            arr[0][0] = 0;
        }
    }
}
