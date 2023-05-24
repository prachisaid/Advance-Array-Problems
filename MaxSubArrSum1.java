public class MaxSubArrSum1 {
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(arr));
    }

    static int maxSum(int[] arr){
        int sum = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum = 0;
            for (int j = i; j < arr.length-1; j++) {
                sum += arr[j];
            }

            maxi = Math.max(sum, maxi);
        }

        return maxi;
    }
}
