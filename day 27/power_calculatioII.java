public class power_calculatioII{
    public static int Power(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) {
            int ans = Power(a, b/2);
            return ans*ans;
        } else {
            int ans = Power(a, b/2);
            return ans*ans*a;
        }
    }
    public static void main(String[] args) {
        System.out.println(Power(2, 0));
    }
}