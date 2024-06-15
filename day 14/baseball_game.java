import java.util.*;

public class baseball_game {
    public static int Bruteforce(String operations[]){
        Stack<Integer> sh = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            // int item = Integer.parseInt(operations[i]);
            if (operations[i] == "D") {
                sh.push(sh.peek()*2);
            } else if (operations[i] == "C") {
                sh.pop();
            } else if(operations[i] == "+"){
                if (sh.size() >= 2) {
                    int topEle = sh.pop();
                    int secondtopEle = sh.pop();
                    sh.push(secondtopEle);
                    sh.push(topEle);
                    sh.push(topEle + secondtopEle);
                } } else {
                sh.push(Integer.parseInt(operations[i]));
                // ops.add(item);
            }
        }
        Integer newarr[] = new Integer[sh.size()];
        sh.toArray(newarr);

        int sum = 0;
        for(int i = 0; i < newarr.length; i++){
            sum = sum + newarr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        String operations[] = {"5","-2","4","C","D","9","+","+"};
        System.out.println(Bruteforce(operations));
    }
}