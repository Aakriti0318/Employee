public class MyBinaryNode <K extends Comparable<K>> implements INode<K> {
    private K key;
    private INode<K> left;
    private INode<K> right;
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public INode<K> getLeft() {
        return left;
    }
    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }
    @Override
    public INode<K> getRight() {
        return right;
    }
    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }
}
// Binary Search Tree class
class BinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Add a node to the BST
    public void add(K key) {
        root = addRecursive(root, key);
    }

    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRecursive((MyBinaryNode<K>) current.getLeft(), key));
        } else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursive((MyBinaryNode<K>) current.getRight(), key));
        }
        return current;
    }

    // In-order traversal of the BST
    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(MyBinaryNode<K> current) {
        if (current != null) {
            inOrderTraversalRecursive((MyBinaryNode<K>) current.getLeft());
            System.out.print(current.getKey() + " ");
            inOrderTraversalRecursive((MyBinaryNode<K>) current.getRight());
        }
    }
    public boolean search(K key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return false; // Key not found
        }

        if (key.compareTo(current.getKey()) == 0) {
            return true; // Key found
        }

        // Recur to the left or right subtree
        if (key.compareTo(current.getKey()) < 0) {
            return searchRecursive((MyBinaryNode<K>) current.getLeft(), key);
        } else {
            return searchRecursive((MyBinaryNode<K>) current.getRight(), key);
        }
    }
}
