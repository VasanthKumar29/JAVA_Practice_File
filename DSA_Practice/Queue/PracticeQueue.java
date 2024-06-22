package DSA_Practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(7);
    q.add(10);
    q.add(15);
    q.add(14);

    System.out.println(q);

    System.out.println(q.remove());
    System.out.println(q);

    System.out.println(q.peek());
    System.out.println(q);
  }
}
