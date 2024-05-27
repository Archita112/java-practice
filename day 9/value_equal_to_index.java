import java.util.ArrayList;

public class value_equal_to_index {
    public static ArrayList<Integer> Findveti(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            // int j = 0;
            // if (j == arr[i]) {
            //     list.add(j);
            //     if (j < arr.length) {
            //         j++;
            //     }
            // }
            for(int j = 0; j<arr.length; j++){
                if (arr[j] == i) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {15, 2, 45, 12, 7};
        System.out.println(Findveti(arr));
    }
}
