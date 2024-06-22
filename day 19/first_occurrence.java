public class first_occurrence {
    public static int Occurrence(String haystack, String needle){
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i <= n-m; i++){
            if (haystack.substring(i, i+m).contains(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(Occurrence(haystack, needle));
    }
}
