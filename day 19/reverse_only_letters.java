public class reverse_only_letters{
    public static String ReverseLetters(String s){
        StringBuilder sb = new StringBuilder();

        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j))) {
                    j--;
                }
                sb.append(s.charAt(j));
                j--;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s  = "a-bC-dEf-ghIj";
        System.out.println(ReverseLetters(s));
    }
}