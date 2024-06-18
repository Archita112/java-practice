// package day 16;

import java.util.Stack;

public class simplify_path {
    public static String simplify(String path) {
        String arr[] = path.split("/");
        Stack<String> sh = new Stack<>();

        for (String i : arr) {
            if (i.equals("..")) {
                if (!sh.empty()) {
                    sh.pop();
                }
            } else if (!i.equals("") && !i.equals(".")) {
                sh.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String i : sh) {
            sb.append("/");
            sb.append(i);
        }

        return sb.length() == 0 ? "/" : sb.toString();
        // return arr.toString();
    }

    public static void main(String[] args) {
        String path = "/home/";
        System.out.println(simplify(path));
    }
}
