import java.util.*;

public class no_lunch {
    public static int Noofstudents(int students[], int sandwichs[]){
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> sh = new Stack<>();
        for (int i = sandwichs.length - 1; i >= 0; i--) {
            sh.push(sandwichs[i]);
        }
        for (int student : students) {
            q.add(student);
        }
        while (!sh.isEmpty()) {
            if (q.peek() == sh.peek()) {
                q.remove();
                sh.pop();
            } else {
                q.add(q.remove());
            }
        }

        if (q.isEmpty() && sh.isEmpty()) {
            return 0;
        } else {
            count = q.size();
        }

        return count;
    }
    public static void main(String[] args) {
        int students[] = {1, 1, 0, 0};
        int sandwichs[] = {0, 1, 0, 1};

        System.out.println(Noofstudents(students, sandwichs));
    }
}
