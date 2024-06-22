package DSA_Practice.Searching;

import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int input = sc.nextInt();
    sc.nextLine();
    sc.close();

    for (int i = 0; i < n; i++) {
      if (input == arr[i]) {
        System.out.println("The input number is found at the index : " + i);
        System.exit(0);
      }
    }

    System.out.println("The input number is not present in the array");
  }
}
