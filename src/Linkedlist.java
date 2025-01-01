package org.example;
import java.util.LinkedList;

class Node {
    int data;
    Node next;
    // Constructor to initialize node data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist{
    static Node head;

    public static void main(String[] args) {
        //displayList();
        /*pop();*/
        /*popLast();*/
    }
    public static void addNodeAtFront(int data,LinkedList<Integer> list) {
        Node newNode = new Node(data);
        newNode.next = head; // Link the new node to the current head
        head = newNode;// Update the head to the new node
        list.add(head.data);
    }
    public void appendNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; // Append the new node at the end
        }
    }

    public boolean insertAfter(int key, int data) {
        Node temp = head;

        // Traverse the list to find the node with the given key
        while (temp != null) {
            if (temp.data == key) {
                Node newNode = new Node(data); // Create the new node
                newNode.next = temp.next; // Link the new node to the next node
                temp.next = newNode; // Link the current node to the new node
                return true; // Node successfully inserted
            }
            temp = temp.next;
        }

        return false; // Node with the key not found
    }

    public boolean deleteNode(int key){
        if(head==null){
            return false;
        }
        if(head.next==null){
            head=head.next;
            return true;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next; // Remove the node with the given key
            return true;
        }

        return false;
    }
   /* public static void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }*/
    public static void pop() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to pop.");
        } else {
            System.out.println("Popping: " + head.data);
            head = head.next; // Update the head to the next node
        }
    }
    public static void popLast() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to pop.");
        } else if (head.next == null) {
            // If there's only one node, remove it
            System.out.println("Popping: " + head.data);
            head = null;
        } else {
            Node temp = head;
            // Traverse to the second-to-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Popping: " + temp.next.data);
            temp.next = null; // Remove the last node by setting the second-to-last's `next` to null
        }
    }
    public static boolean searchNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true; // Node with the key is found
            }
            temp = temp.next;
        }
        return false; // Node with the key is not found
    }

}