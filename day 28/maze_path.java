public class maze_path{
    public static int maze(int row, int col, int m, int n){
        if (row == m || col == n) return 1;
        int rightwards = maze(row+1, col, m, n);
        int downwards = maze(row, col+1, m, n);
        return rightwards + downwards;
    }

    public static int maze2(int m, int n){
        if (m == 1 || n == 1) return 1;
        int rightways = maze2(m, n-1);
        int downways = maze2(m-1, n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        // System.out.println(maze(1, 1, 3, 3));
        System.out.println(maze2(3, 3));
    }
}