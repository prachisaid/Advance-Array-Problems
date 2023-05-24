import java.util.Arrays;

// Dutch National Flag ALgorithm

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2
            
            , 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                System.out.println(mid);
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                System.out.println(mid);
                swap(arr, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
    }

    static void swap(int[] arr, int a1, int a2) {
        int temp = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = temp;     
    }
}
