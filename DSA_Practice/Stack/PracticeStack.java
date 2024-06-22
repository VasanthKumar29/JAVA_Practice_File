package DSA_Practice.Stack;

import java.util.Stack;

public class PracticeStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    stack.push(7);
    stack.push(10);
    stack.push(14);

    System.out.println(stack);

    System.out.println(stack.peek());
    System.out.println(stack);

    System.out.println(stack.pop());
    System.out.println(stack);

  }
}