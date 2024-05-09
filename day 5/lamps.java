// Sometimes some words like "localization" or "internationalization" are so long that 
//writing them many times in one text is quite tiresome.

// Let's consider a word too long, if its length is strictly more than 10 characters. 
//All too long words should be replaced with a special abbreviation.

// This abbreviation is made like this: we write down the first and the last letter 
//of a word and between them we write the number of letters between the first and 
//the last letters. That number is in decimal system and doesn't contain any leading zeroes.

// Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

// You are suggested to automatize the process of changing the words with abbreviations. 
//At that all too long words should be replaced by the abbreviation and the words that 
//are not too long should not undergo any changes.

import java.util.Scanner;
// import java.util.Random;

public class lamps {

    public static String compact_string(String word){
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        if(n > 10){
            // String newString = word.substring(1, 11);
            // System.out.println(newString);
            // char n1 = (char)newString.length();
            // int n1 = newString.length();
            sb.append(word.charAt(0));
            sb.append(n-2);
            sb.append(word.charAt(n-1));
            // String newnewString = (String)word.replace(newString, n1);
            // System.out.println(word.charAt(0) + newString.length() + word.charAt(n));
            return sb.toString();
        }
        else{
            // System.out.println("Error");
            return word;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i = 1; i<=no; i++){
            String word = sc.next();
            // System.out.println("Abbreviated word:");
            System.out.println(compact_string(word));
        }
        // int n = word.length();
        sc.close();
    }
}