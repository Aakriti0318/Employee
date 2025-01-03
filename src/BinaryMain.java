public class BinaryMain {
    public static void main(String[] args) {
        // Create the Binary Search Tree
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Add nodes
        bst.add(56); // Root node
        bst.add(30); // Left of 56
        bst.add(70); // Right of 56
        bst.add(63);//add 63
        // Display the BST using in-order traversal
        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal(); // Should print: 30 56 70

        System.out.println("\n\nSearching for 63 in the BST:");
        boolean isFound = bst.search(63);
        System.out.println("Key 63 found: " + isFound);

        System.out.println("\nSearching for 45 in the BST:");
        isFound = bst.search(45);
        System.out.println("Key 45 found: " + isFound);
    }
}
