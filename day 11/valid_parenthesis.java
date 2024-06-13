//manually ban gaya par leetcode pe ek testcase pe atak gaya
//hint - stacks

public class valid_parenthesis {
    public static boolean Validp(String p){
        for(int i = 1; i<p.length()-1; i++){
            if ((p.charAt(i) == '(' && p.charAt(i+1) == ')') || (p.charAt(i) == '[' && p.charAt(i+1) == ']') || (p.charAt(i) == '{' && p.charAt(i+1) == '}') || (p.charAt(i) == ')' && p.charAt(i-1) == '(') || (p.charAt(i) == ']' && p.charAt(i-1) == '[') || (p.charAt(i) == '}' && p.charAt(i-1) == '{')) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String p = "}{(){}";
        System.out.println(Validp(p));
    }
}
