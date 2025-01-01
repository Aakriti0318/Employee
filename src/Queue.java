package org.example;

import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> linkedList;

    // Constructor to initialize the queue
    public Queue() {
        linkedList = new LinkedList<>();
    }

    // Enqueue operation: Add element to the rear of the queue
    public void enqueue(T data) {
        linkedList.addLast(data);  // Adds to the end of the LinkedList (rear of the queue)
    }

    // Dequeue operation: Remove and return the front element
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        return linkedList.removeFirst();  // Removes from the front of the LinkedList (front of the queue)
    }

    // Peek operation: View the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }
        return linkedList.getFirst();  // Retrieves the first element without removing it
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Display all elements in the queue (optional for debugging)
    public void displayQueue() {
        System.out.println("Queue: " + linkedList);
    }
}
