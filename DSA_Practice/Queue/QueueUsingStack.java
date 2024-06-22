package DSA_Practice.Queue;

import java.util.*;

public class QueueUsingStack {
  Stack<Integer> s1;
  Stack<Integer> s2;

  public QueueUsingStack() {
    s1 = new Stack<>();
    s2 = new Stack<>();
  }

  public void enqueue(int val) {
    s1.push(val);
  }

  public int dequeue() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    if (s2.isEmpty()) {
      System.out.println("Sorry Queue is empty, unable to deque");
      return -1;
    }
    return s2.pop();
  }

  public int peek() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    if (s2.isEmpty()) {
      System.out.println("Sorry Queue is empty, unable to peek");
      return -1;
    }
    return s2.peek();
  }

  public static void main(String[] args) {
    QueueUsingStack q = new QueueUsingStack();

    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);

    System.out.println(q.dequeue());
    q.dequeue();

    System.out.println(q.peek());
    System.out.println(q.dequeue());

    System.out.println(q.dequeue());// queue is empty here

  }
}
