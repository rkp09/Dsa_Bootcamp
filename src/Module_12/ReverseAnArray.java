package Module_12;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        // Reverse an array using SwapInArray.swap();
        Scanner in = new Scanner(System.in);
        System.out.print("What the size that you want for array? ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Now : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reversing : " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            SwapInArray.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
