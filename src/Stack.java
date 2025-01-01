package org.example;
import java.util.LinkedList;

class Stack <T> {
    private LinkedList<T> linkedList;

    // Constructor to initialize the stack
    public Stack() {
        linkedList = new LinkedList<>();
    }

    // Push operation: Add element to the top of the stack
    public void push(T data) {
        linkedList.addFirst(data); // Adds to the front of the LinkedList
    }

    // Pop operation: Remove and return the top element
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        return linkedList.removeFirst(); // Removes from the front of the LinkedList
    }

    // Peek operation: View the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return linkedList.getFirst(); // Retrieves the first element without removing it
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Display all elements in the stack (optional for debugging)
    public void displayStack() {
        System.out.println("Stack: " + linkedList);
    }
}
