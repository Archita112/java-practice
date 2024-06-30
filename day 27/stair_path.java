public class stair_path {
    public static int Stair(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return Stair(n-1) + Stair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Stair(45));
    }
}
