public class repeated_string_match {
    public static int RepeatedMatch(String a, String b){
        StringBuilder sb = new StringBuilder();
        while(sb.length() < b.length()){
            sb.append(a);
            int start = 0;
            int end = start + 1;
            while (!sb.substring(start, end).equals(b) && end < sb.length()) {
                end++;
            } start++;
            if (sb.substring(start, end).equals(b)) {
                break;
            }
        }
        return sb.toString().length()/a.length();
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(RepeatedMatch(a, b));
    }
}
