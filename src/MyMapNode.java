public class MyMapNode {
    String data;
    int value;
    MyMapNode next;

    public MyMapNode(String key, int value) {
        this.data = key;
        this.value = value;
        this.next = null;
    }
}
class LinkedList {
    private MyMapNode head;

    // Insert or update the frequency of a key
    public void insertOrUpdate(String key) {
        MyMapNode current = head;

        // Search for the key in the list
        while (current != null) {
            if (current.data.equals(key)) {
                current.value++;
                return;
            }
            current = current.next;
        }

        // If key is not found, insert a new node at the head
        MyMapNode newNode = new MyMapNode(key, 1);
        newNode.next = head;
        head = newNode;
    }
    public void remove(String key){
        if (head == null) {
            System.out.println("The list is empty. No word to remove.");
            return;
        }
        // If the head node is the one to remove
        if (head.data.equals(key)) {
            head = head.next;
            System.out.println("Removed: " + key);
            return;
        }
        // Traverse the list to find the key
        MyMapNode current = head;
        while (current.next != null) {
            if (current.next.data.equals(key)) {
                current.next = current.next.next;
                System.out.println("Removed: " + key);
                return;
            }
            current = current.next;
        }

        // If the key is not found
        System.out.println("Word not found: " + key);

    }
    // Display all key-value pairs
    public void display() {
        MyMapNode current = head;
        while (current != null) {
            System.out.println(current.data + ": " + current.value);
            current = current.next;
        }
    }
}
