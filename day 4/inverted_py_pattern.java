// package day 4;

//this pyramid looks like this
//              *
//          *   *
//      *   *   *
// *    *   *   *

public class inverted_py_pattern {
    public static void inverted_rotated_patter(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                if( (i+j) > 5){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_patter(4);
    }
}
