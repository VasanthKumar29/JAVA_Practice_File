package DSA_Practice.Stack;

public class Stack {
  private int maxSize;
  private int[] stackArray;
  private int top;

  // Constructor to initialize the stack with a maximum size
  public Stack(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  // Method to add an element to the stack
  public void push(int value) {
    if (isFull()) {
      System.out.println("Stack is full. Unable to push " + value);
      return;
    }
    stackArray[++top] = value;
  }

  // Method to remove and return the top element of the stack
  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty. Unable to pop.");
      return -1;
    }
    return stackArray[top--];
  }

  // Method to return the top element of the stack without removing it
  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty. Unable to peek.");
      return -1;
    }
    return stackArray[top];
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return (top == -1);
  }

  // Method to check if the stack is full
  public boolean isFull() {
    return (top == maxSize - 1);
  }

  // Main method to test the Stack class
  public static void main(String[] args) {
    Stack stack = new Stack(5);

    // Push elements onto the stack
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    // Attempt to push an element onto a full stack
    stack.push(60);

    // Peek at the top element
    System.out.println("Top element is: " + stack.peek());

    // Pop elements from the stack
    System.out.println("Popped element: " + stack.pop());
    System.out.println("Popped element: " + stack.pop());

    // Peek at the top element after popping
    System.out.println("Top element is: " + stack.peek());

    // Print the stack state
    System.out.println("Stack empty: " + stack.isEmpty());
    System.out.println("Stack full: " + stack.isFull());
  }
}
