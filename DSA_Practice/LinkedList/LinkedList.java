package DSA_Practice.LinkedList;

public class LinkedList {
  // Node class representing each element in the linked list
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Head of the list
  private Node head;

  // Method to add a new node at the end of the list
  public void add(int data) {
    Node newNode = new Node(data);

    // If the list is empty, make the new node the head
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      // Traverse to the end of the list
      while (current.next != null) {
        current = current.next;
      }
      // Link the last node to the new node
      current.next = newNode;
    }
    System.out.println("Added the date :" + data);
  }

  // Method to delete a node by value
  public void delete(int data) {
    // If the list is empty, do nothing
    if (head == null) {
      System.out.println("Sorry the list is emply");
      return;
    }

    // If the head needs to be removed
    if (head.data == data) {
      head = head.next;
      return;
    }

    Node current = head;
    // Traverse the list to find the node to be deleted
    while (current.next != null && current.next.data != data) {
      current = current.next;
    }

    // If the node was found, unlink it from the list
    if (current.next != null) {
      current.next = current.next.next;
    }
    System.out.println("Succesfully the data " + data + " is deleted from the list");
  }

  // Method to print the elements of the list
  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  // Main method to test the LinkedList class
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    // Add elements to the list
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    // Print the list
    System.out.println("Linked List:");
    list.printList();

    // Delete an element from the list
    list.delete(3);

    // Print the list after deletion
    System.out.println("Linked List after deleting node with data 3:");
    list.printList();
  }
}
