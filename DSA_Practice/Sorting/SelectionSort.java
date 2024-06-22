package DSA_Practice.Sorting;

import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    for (int i = 0; i < n; i++) {
      int min_index = i;
      int min = Integer.MAX_VALUE;
      for (int j = i; j < n; j++) {
        if (arr[j] < min) {
          min = arr[j];
          min_index = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = temp;
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}