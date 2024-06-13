// package day 12;

public class stack_linkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stackll{
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Stackll.push(1);
        Stackll.push(2);
        Stackll.push(3);

        while (!Stackll.isEmpty()) {
            System.out.print(Stackll.peek() + " ");
            Stackll.pop();
        }
    }
}
