import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dst {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 4},
            {2, 6},
            {8, 10},
            {9, 9}
        };

        int[][] arr1 = merge(arr);

        for (int[] a : arr1) {
            System.out.println(Arrays.toString(a));;
        }
    }

    static int[][] merge(int[][] arr){

        List<int[]> list = new ArrayList<>();

        Arrays.sort(arr,(a, b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];
         
        for (int[] a : arr) {
            if(a[0] <= end){
                end = Math.max(end, a[1]);
            }else{
                list.add(new int[]{start, end});
                start = a[0];
                end = a[1];
            }
        }    
         
        list.add(new int[]{start, end});
        return list.toArray(new int[0][]);

    }
}
