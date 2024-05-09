public class linear_search {
    public static int search(int marks[], int key){
        for(int i = 0; i <= marks.length; i++){
            if (marks[i] == key) {
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int marks[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 20;
        System.out.println(search(marks, key));
    }
}