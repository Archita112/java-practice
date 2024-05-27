// package day 9;

public class selection_sort {
    public static void Selectionsort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            int smallest = i;
            for(int j = i+1; j<n; j++){
                if (arr[j] < arr[smallest]) {
                    // smallest = Math.min(smallest, arr[j]);
                    // arr[i] = smallest;
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Selectionsort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
