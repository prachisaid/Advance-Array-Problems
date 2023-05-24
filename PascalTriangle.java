import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
       
       }

    static List<List<Integer>> pascalTri(int numRows){
        if(numRows==0){ 
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1){
                    row.add(1);
                }else{
                    row.add(list.get(i-2).get(j) + list.get(i-2).get(j-1));
                }
            }
            list.add(row);
        }

        return list;
    }

    // static int[][] pascalTri(int n){
    //     int[][] arr = new int[n][];
        
    //     arr[0][0] = 1;
    //     arr[1][0] = arr[1][1] = 1;
        
    //     int[] demo = new int[5];
        
    //     demo[0] = 1;
    //     demo[1] = 1;
        
    //     for (int i = 2; i < n; i++) {
    //         int counter = 1;
    //         arr[i][0] = 1;
    //         for (int j = 1; j < i; j++) {
    //             arr[i][j] = demo[j] + demo[j-1];
    //             counter++;
    //             demo[j] = arr[i][j];
    //         }
    //         arr[i][counter] = 1;
    //         demo[counter] = 1;
    //     }

    //     return arr;
    // }
}
