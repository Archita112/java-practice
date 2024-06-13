import java.util.Arrays;

public class longest_common_prefix {
    public static String Longestprefix(String strs[]){
        int size = strs.length;

        if (size == 0)
            return "";

        if (size == 1)
            return strs[0];

        Arrays.sort(strs);

        // for(int i = 0; i<strs.length; i++){
        //     System.out.print(strs[i]);
        // }
        int end = Math.min(strs[0].length(), strs[size-1].length());

        int i = 0;
        while(i < end && strs[0].charAt(i) == strs[size-1].charAt(i))
            i++;
        
        String news = strs[0].substring(0, i);
        return news;
    }
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        System.out.println(Longestprefix(strs));
    }
}
