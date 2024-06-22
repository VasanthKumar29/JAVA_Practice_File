package DSA_Practice.Searching;

import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    sc.close();

    Arrays.sort(arr);// Binary search works only in sorted array

    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;

      if (arr[mid] == target) {
        System.out.println("The target number found at index : " + mid);
        System.exit(0);
      }

      else if (arr[mid] < target) {
        left = mid + 1;
      }

      else {
        right = mid - 1;
      }
    }

    System.out.println("Target is not present in the array");

  }
}
