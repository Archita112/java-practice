public class easy_sorting {
    public static void min_and_max(int a, int b){
        int minx = Math.min(a, b);
        int maxx = Math.max(a, b);
        System.out.println(minx + " " + maxx);
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        // System.out.println(a + " " + b);
        min_and_max(a, b);
    }
}
