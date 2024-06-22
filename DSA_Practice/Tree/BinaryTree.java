package DSA_Practice.Tree;

// Node class representing each element in the tree
class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

// BinaryTree class containing basic operations
public class BinaryTree {
  TreeNode root;

  public BinaryTree() {
    root = null;
  }

  // Method to insert a new node into the tree
  public void insert(int data) {
    root = insertRec(root, data);
  }

  // Recursive method to insert a new node into the tree
  private TreeNode insertRec(TreeNode root, int data) {
    if (root == null) {
      root = new TreeNode(data);
      return root;
    }

    if (data < root.data) {
      root.left = insertRec(root.left, data);
    } else if (data > root.data) {
      root.right = insertRec(root.right, data);
    }

    return root;
  }

  // Method to perform in-order traversal of the tree
  public void inOrderTraversal() {
    inOrderRec(root);
  }

  // Recursive method for in-order traversal
  private void inOrderRec(TreeNode root) {
    if (root != null) {
      inOrderRec(root.left);
      System.out.print(root.data + " ");
      inOrderRec(root.right);
    }
  }

  // Method to search for a node in the tree
  public boolean search(int data) {
    return searchRec(root, data);
  }

  // Recursive method to search for a node in the tree
  private boolean searchRec(TreeNode root, int data) {
    if (root == null) {
      return false;
    }
    if (root.data == data) {
      return true;
    }
    return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
  }

  // Main method to test the BinaryTree class
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    // Insert elements into the tree
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    // Perform in-order traversal of the tree
    System.out.println("In-order traversal:");
    tree.inOrderTraversal();
    System.out.println();

    // Search for elements in the tree
    System.out.println("Search 40: " + tree.search(40));
    System.out.println("Search 90: " + tree.search(90));
  }
}
