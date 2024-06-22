package DSA_Practice.Queue;

public class Queue {
  private int maxSize;
  private int[] queueArray;
  private int front;
  private int rear;
  private int currentSize;

  // Constructor to initialize the queue with a maximum size
  public Queue(int size) {
    maxSize = size;
    queueArray = new int[maxSize];
    front = 0;
    rear = -1;
    currentSize = 0;
  }

  // Method to add an element to the queue
  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("Queue is full. Unable to enqueue " + value);
      return;
    }
    // Circular increment of rear
    rear = (rear + 1) % maxSize;
    queueArray[rear] = value;
    currentSize++;
  }

  // Method to remove and return the front element of the queue
  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty. Unable to dequeue.");
      return -1;
    }
    int temp = queueArray[front];
    // Circular increment of front
    front = (front + 1) % maxSize;
    currentSize--;
    return temp;
  }

  // Method to return the front element of the queue without removing it
  public int peek() {
    if (isEmpty()) {
      System.out.println("Queue is empty. Unable to peek.");
      return -1;
    }
    return queueArray[front];
  }

  // Method to check if the queue is empty
  public boolean isEmpty() {
    return (currentSize == 0);
  }

  // Method to check if the queue is full
  public boolean isFull() {
    return (currentSize == maxSize);
  }

  // Main method to test the Queue class
  public static void main(String[] args) {
    Queue queue = new Queue(5);

    // Enqueue elements into the queue
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);

    // Attempt to enqueue an element into a full queue
    queue.enqueue(60);

    // Peek at the front element
    System.out.println("Front element is: " + queue.peek());

    // Dequeue elements from the queue
    System.out.println("Dequeued element: " + queue.dequeue());
    System.out.println("Dequeued element: " + queue.dequeue());

    // Peek at the front element after dequeuing
    System.out.println("Front element is: " + queue.peek());

    // Print the queue state
    System.out.println("Queue empty: " + queue.isEmpty());
    System.out.println("Queue full: " + queue.isFull());
  }
}
