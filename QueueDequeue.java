public class QueueDequeue {
    private int[] queue;
    private int front, rear, capacity;

    public QueueDequeue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return false;
        }
        rear++;
        queue[rear] = data;
        return true;
    }

    // Task 2: Dequeue operation
    public int dequeue() {
        // a. Check if empty
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        // c. Access data at front
        int data = queue[front];
        // d. Increment front
        front++;
        System.out.println(data + " dequeued successfully.");
        return data; // e. Return success (the value)
    }

    public void display() {
        if (front > rear) {
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
        QueueDequeue q = new QueueDequeue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}