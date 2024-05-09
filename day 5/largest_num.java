// import java.util.*;

public class largest_num {
    public static int smaller_num(int marks[]){
        int smallest = Integer.MAX_VALUE;
        // int temp = 1;
        for(int i = 0; i<marks.length; i++){
            if(marks[i] < smallest){
                smallest = marks[i];
                // largest = temp;
                // temp = marks[i];
                // marks[i] = largest;
            }
        }
        return smallest;
    }
    public static int larger_num(int marks[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        // int temp = 1;
        for(int i = 0; i<marks.length; i++){
            if(marks[i] > largest){
                largest = marks[i];
                // largest = temp;
                // temp = marks[i];
                // marks[i] = largest;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int marks[] = {1, 2, 6, 3, 9, 5};
        System.out.println(larger_num(marks));
        System.out.println(smaller_num(marks));
    }
}
