public class traverse_an_array {
    public static void traverse(int arr[], int n) {
        if (n == arr.length) return;
        System.out.print(arr[n] + " ");
        traverse(arr, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        traverse(arr, 0);
    }
}
