public class reverse_string {
    public static void Reverse(char ch[]){
        System.out.print("[");
        for(int i = ch.length-1; i >= 0; i--){
            System.out.print('"' + String.valueOf(ch[i]) + '"');
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        char ch[] = {'h', 'e', 'l', 'l', 'o'};
        Reverse(ch);
    }
}
