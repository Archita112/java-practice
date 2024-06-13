public class shortest_path {
    public static float Shortest_route(String str){
        int x = 0, y = 0;
        for(int i = 0; i<str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            }
            else if (dir == 'S'){
                y--;
            }
            else if (dir == 'E') {
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        float displacement = (float) Math.sqrt(x2 + y2);
        return displacement;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Shortest_route(path));
    }
}
