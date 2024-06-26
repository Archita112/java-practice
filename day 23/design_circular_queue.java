public class design_circular_queue{
    static class CQueue{
        int front = -1;
        int rear = -1;
        int size;
        int[] CQ;

        public CQueue(int k){
            CQ = new int[k];
            size = k;
        }

        public boolean insertFront(int value){
            if (isFull())
            return false;

            if (isEmpty()) {
                front = 0;
                rear = 0;
                CQ[front] = value;
            } else if (front == 0) {
                front = size - 1;
                CQ[front] = value;
            } else {
                front--;
                CQ[front] = value;
            }
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull())
                return false;
    
            if (isEmpty()) {
                front = 0;
                rear = 0;
                CQ[rear] = value;
            } else if (rear == size - 1) {
                rear = 0;
                CQ[rear] = value;
            } else {
                rear++;
                CQ[rear] = value;
            }
            return true;
        }
    
        public boolean deleteFront() {
            if (isEmpty())
                return false;
    
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
            return true;
        }
    
        public boolean deleteLast() {
            if (isEmpty())
                return false;
    
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
            return true;
        }
    
        public int getFront() {
            if (isEmpty())
                return -1;
            return CQ[front];
        }
    
        public int getRear() {
            if (isEmpty())
                return -1;
            return CQ[rear];
        }
    
        public boolean isEmpty() {
            return front == -1;
        }
    
        public boolean isFull() {
            return front == (rear + 1) % size;
        }
    }
    public static void main(String[] args) {
        CQueue cq = new CQueue(5);
        cq.insertFront(1);
        cq.insertLast(2);
        cq.insertLast(3);
        cq.insertLast(4);
        cq.insertLast(5);

        for(int i = 0; i < cq.size; i++){
            System.out.println(cq.deleteLast());
        }
    }
}