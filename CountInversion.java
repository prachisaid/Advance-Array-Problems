public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};

        System.out.println(count(arr));
    }

    static int count(int[] arr){

        insertion(arr);
        int len = ((arr.length)*(arr.length-1))/2;

        return len;
    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }

                
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
