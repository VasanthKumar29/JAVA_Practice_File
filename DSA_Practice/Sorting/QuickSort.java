package DSA_Practice.Sorting;

import java.util.Scanner;

public class QuickSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    quickSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partition = findPartition(arr, low, high);
      quickSort(arr, low, partition - 1);
      quickSort(arr, partition + 1, high);
    }
  }

  public static int findPartition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low, j = high;
    while (i < j) {

      while (arr[i] <= pivot && i <= high + 1)
        i++;
      while (arr[j] > pivot && j >= low + 1)
        j--;

      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }
}
