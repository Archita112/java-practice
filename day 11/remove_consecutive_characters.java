public class remove_consecutive_characters {
    public static String Removechars(String S){
        StringBuilder sb = new StringBuilder("");
        sb.append(S.charAt(0));
        for(int i = 1; i<S.length();i++){
            if (S.charAt(i) != S.charAt(i-1)) {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S = "aabb";
        System.out.println(Removechars(S));
    }
}
