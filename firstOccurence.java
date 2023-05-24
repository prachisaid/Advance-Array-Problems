public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(str(haystack, needle));
    }

    static int str(String haystack, String needle){
        int m = haystack.length();
        int n = needle.length();
//        boolean found = false;

        if(n == 0){
            return 0;
        }

        for(int i = 0; i <= m - n; i++) {
            boolean found = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }

        return -1;
    }
}