public class reverse_words_of_a_string {
    public static String Reverse_word(String s){
        //1. i tried using character stack.

        // Stack<Character> sh = new Stack<>();

        // char newstr[] = s.toCharArray();
        // for(int i = 0; i < newstr.length; i++){
        //     sh.push(s.charAt(i));
        // }

        // return sh.toString();

        //2. i tried using string stack.
        s = s.trim().replaceAll("( )+", " ");
        
        System.out.println(s);
        String newstr[] = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = newstr.length - 1; i >= 0 ; i--){
            if (i == 0) {
                sb.append(newstr[i]);
            } else {
                sb.append(newstr[i] + " ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = " Hello   World ";
        System.out.println(Reverse_word(s));
    }
}
