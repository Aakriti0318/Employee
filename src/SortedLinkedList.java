import org.example.Linkedlist;
class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    // Constructor to initialize node data
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class SortedLinkedList<T extends Comparable<T>> extends Linkedlist {
    public Node<T> head;
    // Method to add a node while maintaining sorted order
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // If the list is empty or the new node should be the new head
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to find the correct position for the new node
        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        // Insert the new node at the correct position
        newNode.next = current.next;
        current.next = newNode;
    }

    public void displayList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}