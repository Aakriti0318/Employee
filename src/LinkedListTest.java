import org.example.Linkedlist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest extends Linkedlist {

    @Test
    void testSearchNode() {
        Linkedlist list = new Linkedlist();
        // Add elements to the linked list
        /*list.appendNode(56);
        list.appendNode(30);
        list.appendNode(70);
        list.insertAfter(30,40);
        list.deleteNode(40);*/
        //System.out.println("LinkedList:");
        //list.displayList();

        // Test case to check if node with value 30 exists
        //assertTrue(list.searchNode(30), "Node with value 30 should be found");

        // Test case to check if a non-existing node is not found
        //assertFalse(list.searchNode(100), "Node with value 100 should not be found");
        //assertTrue(list.insertAfter(30, 40), "Node with value 40 should be found after 30");
    }
    @Test
    void testAddAndSort() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();

        // Add elements in arbitrary order
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Sorted LinkedList:");
        list.displayList();
        Node<Integer> temp = list.head;
        assertNotNull(temp, "Head should not be null");
        assertEquals(30, temp.data, "First node should be 30");
        temp = temp.next;
        assertNotNull(temp, "Second node should not be null");
        assertEquals(40, temp.data, "Second node should be 40");
        temp = temp.next;
        assertNotNull(temp, "Third node should not be null");
        assertEquals(56, temp.data, "Third node should be 56");
        temp = temp.next;
        assertNotNull(temp, "Fourth node should not be null");
        assertEquals(70, temp.data, "Fourth node should be 70");
        assertNull(temp.next, "Fourth node should be the last");
    }
}