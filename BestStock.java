public class BestStock{
    public static void main(String[] args) {
        int[] arr  = {7, 1, 5, 3, 6, 4};
        System.out.println(bestStock(arr));
    }

    static int bestStock(int[] arr){
        int minVal = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal){
                minVal = arr[i];
            }
            profit = Integer.max(profit, arr[i]-minVal);
        }

        return profit;
    }
}