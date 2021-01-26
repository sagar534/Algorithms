package main.java.com.dhana.veera.sorting;

import java.util.stream.IntStream;


/***
 * This program sorts array elements first half in ascending and next half in descending order
 *
 * status:Complete
 *
 */
public class AscDes {
    public static int[] swap(int[] arr, int i, int j) {
        if (arr[i] < arr[j]) {
            int tempVar = arr[i];
            arr[i] = arr[j];
            arr[j] = tempVar;
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 6, 2, 1, 3, 8, 9, -1};

        int temp[] = new int[arr.length];
        int median = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            if (i < median) {
                for (int j = i; j < median; j++) {
                    arr = swap(arr, j, i);
                }
            } else {
                for (int j = i; j < arr.length; j++) {
                    arr = swap(arr, i, j);
                }
            }
            temp[i] = arr[i];
        }
        System.arraycopy(temp,0, arr,0, arr.length);
        IntStream.of(arr).forEach(System.out::println);
    }
}
