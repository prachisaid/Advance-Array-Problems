public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {12, 2, 1}, 
            {2, 12}
        };

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts){
        int maxVal = 0;
        for (int person = 0; person < accounts.length; person++) {
            int personsum = 0;
            for (int p_account = 0; p_account < accounts[person].length; p_account++) {
                personsum += accounts[person][p_account];   
            }

            if(personsum > maxVal){
                maxVal = personsum;
            }
        }

        return maxVal;
    }
}
