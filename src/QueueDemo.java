package org.example;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements onto the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Display the queue after enqueue operations
        System.out.println("Queue after enqueuing elements:");
        queue.displayQueue();

        // Peek at the front element of the queue
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue after dequeue:");
        queue.displayQueue();

        // Continue dequeuing until the queue is empty
        System.out.println("\nDequeuing all elements until the queue is empty:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
            queue.displayQueue();
        }
    }
}
