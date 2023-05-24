public class MaxSubArrSum2 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(arr));
    }

    static int maxSum(int[] arr){
        int sum = 0;
        int max = arr[0];

        for (int i : arr) {
            sum += i;
            max = Math.max(sum, max);
            if(sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
