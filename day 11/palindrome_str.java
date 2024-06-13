public class palindrome_str{
    public static boolean Palindrome(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        for(int i = 0; i< str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";
        // string.toLowerCase();
        System.out.println(Palindrome(string));
    }
}