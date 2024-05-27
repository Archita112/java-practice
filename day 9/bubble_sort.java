// package day 9;

public class bubble_sort {
    public static void Bubblesort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            // int temp = 0;
            for(int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    // arr[i] = temp;
                    // temp = arr[j];
                    // arr[j] = arr[i];
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Bubblesort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
