public class sample_code_pip {
    public static void pips(int n){
        if (n == 0) return;
        System.out.print(n);
        pips(n-1);
        System.out.print(n);
        pips(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        pips(1);
        System.out.println();
        pips(2);
        System.out.println();
        pips(3);
        System.out.println();
        pips(4);
    }
}
