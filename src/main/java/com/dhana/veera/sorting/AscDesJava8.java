package main.java.com.dhana.veera.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/***
 * This program sorts array elements first half in ascending and next half in descending order
 *
 * status:Complete
 *
 */
public class AscDesJava8 {

    public static void main(String args[]) {
        int arr[] = {5, 4, 6, 2, 1, 3, 8, 9, -1, 3};
        int left = 0, right = arr.length;
        int mid = (left + right) / 2;
        int[] acsResult = asc(arr, left, mid);
        int[] desresult = des(arr, mid + 1, right);
        Arrays.stream(desresult).forEach(System.out::println);
        System.out.println("--------");
        System.arraycopy(acsResult, 0, arr, 0, acsResult.length);
        System.arraycopy(desresult, 0, arr, acsResult.length, desresult.length);
        Arrays.stream(arr).forEach(System.out::println);

    }


    private static int[] asc(int[] arr, int left, int mid) {
        return Arrays.stream(arr).limit(mid).sorted().toArray();
    }

    private static int[] des(int[] arr, int mid, int right) {
        List<Integer> desArr = Arrays.stream(arr).skip(mid - 1).sorted().boxed().collect(Collectors.toList());
        Collections.reverse(desArr);
        return desArr.stream().mapToInt(i -> i).toArray();
    }
}
