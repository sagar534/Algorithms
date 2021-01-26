package main.java.com.dhana.veera.sorting;

import java.util.stream.IntStream;

/* Java program for Merge Sort */
class MergeSort {
    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 6, 8, 5, 3, 7};
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        IntStream.of(arr).forEach(System.out::println);
    }

    private static void mergeSort(int[] arr, int[] temp, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        } else {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arr, temp, leftIndex, middleIndex);
            mergeSort(arr, temp, middleIndex + 1, rightIndex);
            merge(arr, temp, leftIndex, rightIndex);
        }
    }

    private static void merge(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart, right = rightStart, index = leftStart;
        while (left <= leftEnd && right <= rightEnd) {

            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}


