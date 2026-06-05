public class QueueEnqueue {
    private int[] queue;
    private int front, rear, capacity;

    public QueueEnqueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Task 1: Enqueue operation
    public boolean enqueue(int data) {
        // i. Check if the queue is full
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return false;
        }
        // iii. Increment rear
        rear++;
        // iv. Add data
        queue[rear] = data;
        System.out.println(data + " enqueued successfully.");
        return true; // v. Return success
    }

    public void display() {
        if (rear < front) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueEnqueue q = new QueueEnqueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}