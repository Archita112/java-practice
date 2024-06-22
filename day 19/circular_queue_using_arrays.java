public class circular_queue_using_arrays {
    static class CQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("queue is full.");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue is empty.");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty.");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        CQueue cq = new CQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.remove();
        // System.out.println(cq.remove());
        cq.add(4);
        cq.remove();
        // System.out.println(cq.remove());
        cq.add(5);
        
        while(!cq.isEmpty()){
            System.out.print(cq.peek() + " ");
            cq.remove();
        }
    }    
}
