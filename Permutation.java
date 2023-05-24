import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[][] arr = permute(new int[] {1, 2, 3});

        for (int[] list : arr) {
            System.out.println(Arrays.toString(list));
        }
    }

    static int[][] permute(int[] nums) {
        // List<List<Integer>> a = new ArrayList<>();
        // List<Integer> l = new ArrayList<>();
        // l.add(nums[0]);
        // a.add(l);

        // for (int i = 0; i < nums.length; i++) {
        //     List<List<Integer>> temp = new ArrayList<>();

        //     for (int j = 0; j < a.size(); j++) {

        //         List<Integer> y = a.get(j);
        //         int len = y.size();

        //         for (int k = 0; k <= len; k++) {
        //             y.add(y.get(0)+k, nums[i]);
        //             temp.add(y);
        //             y = a.get(j);

        //         }
        //     }
        //     a = temp;
        // }
        //  return a;

        int[][] arr = new int[6][nums.length];
        
        arr[0][0] = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            int[][] temp = new int[6][nums.length];

            for (int j = 0; j < arr[i].length; j++) {
                int[] y = new int[nums.length];
                y[j] = arr[i][j];
                
                for (int k = 0; k < y.length; k++) {
                    y[0+k] = nums[i];
                    temp[i] = y; 
                    y[j] = arr[i][j];
                }
            }

            arr = temp;
            
        }

        return arr;

    }
}
