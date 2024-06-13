// import java.lang.reflect.Array;
import java.util.Arrays;

public class valid_anagram {
    public static boolean Checkinganagram(String s, String t){
        char tempArr[] = s.toCharArray();
        
        Arrays.sort(tempArr);
        String news = new String(tempArr);

        char tempArr1[] = t.toCharArray();

        Arrays.sort(tempArr1);
        String newt = new String(tempArr1);

        // if (news.equals(newt)) {
        //     return true;
        // }

        // return false;
        return news.equals(newt);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram"; 
        System.out.println(Checkinganagram(s, t));
    }
}
