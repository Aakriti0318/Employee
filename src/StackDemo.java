package org.example;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Display the stack
        System.out.println("Initial Stack:");
        stack.displayStack();

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.displayStack();
    }
}
