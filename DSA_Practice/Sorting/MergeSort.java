package DSA_Practice.Sorting;

import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    mergeSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left >= right)
      return;

    int mid = (left + right) / 2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    merge(arr, left, mid, right);
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left++]);
      } else {
        temp.add(arr[right++]);
      }
    }
    while (left <= mid) {
      temp.add(arr[left++]);
    }
    while (right <= high) {
      temp.add(arr[right++]);
    }
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }
}