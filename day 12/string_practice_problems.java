// package day 12;

import java.util.Arrays;

public class string_practice_problems {
    public static String Sequence(String s){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < s.length(); i++){
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'B') || (s.charAt(i) == 'C')) {
                sb.append('2');
            }
            else if((s.charAt(i) == 'D') || (s.charAt(i) == 'E') || (s.charAt(i) == 'F')){
                sb.append('3');
            }
            else if ((s.charAt(i) == 'G') || (s.charAt(i) == 'H') || (s.charAt(i) == 'I')) {
                sb.append('4');
            }
            else if ((s.charAt(i) == 'J') || (s.charAt(i) == 'K') || (s.charAt(i) == 'L')) {
                sb.append('5');
            }
            else if((s.charAt(i) == 'M') || (s.charAt(i) == 'N') || (s.charAt(i) == 'O')){
                sb.append('6');
            }
            else if ((s.charAt(i) == 'P') || (s.charAt(i) == 'Q') || (s.charAt(i) == 'R') || (s.charAt(i) == 'S')) {
                sb.append('7');
            }
            else if((s.charAt(i) == 'T') || (s.charAt(i) == 'U') || (s.charAt(i) == 'V')){
                sb.append('8');
            }
            else {
                sb.append('9');
            }
        }
        return sb.toString();
    }

    public static int Duplicates(String s){
        char oldarr[] = s.toCharArray();

        Arrays.sort(oldarr);
        // for(int i = 0; i<newarr.length; i++){
        //     System.out.print(newarr[i]);
        // }
        int index1 = 1;
        int index2 = 1;

        while(index1 != oldarr.length){
            if (oldarr[index1] != oldarr[index1-1]) {
                oldarr[index2] = oldarr[index1];
                index2++;
            }
            index1++;
        }

        String str = new String(oldarr);

        return str.substring(0, index2).length();
        
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(Duplicates(s));
        // System.out.println(Sequence(s));
    }
}
