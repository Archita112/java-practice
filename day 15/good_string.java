// import java.util.Stack;

public class good_string {
    public static String CheckgoodString(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if (sb.length() == 0) {
                sb.append(s.charAt(i));
            } else {
                if (Math.abs((sb.charAt(sb.length()-1)) - s.charAt(i)) == 32) {
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(CheckgoodString(s));
    }
}
