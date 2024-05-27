import java.util.ArrayList;

public class first_last_occurrences {
    public static ArrayList<Integer> Occurrences(int arr[], int x){
        // int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 1; j<arr.length-1; j++){
            if (arr[j-1] != x && arr[j] == x) {
                list.add(j);
                // System.out.print(j + " ");
                // return j;
                // i++;
            }
            
            if (arr[j] == x && arr[j+1] != x) {
                list.add(j);
                // System.out.println(j + " ");
                // return j;
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
            // list.add(-1);
        }

        return list;
        // return i;
        // return list.isEmpty() ? -1 : list;
    }
    public static void main(String[] args) {
        int arr[] = {7, 7, 9, 10, 10};
        int x = 6;
        System.out.println(Occurrences(arr, x));

        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
}
