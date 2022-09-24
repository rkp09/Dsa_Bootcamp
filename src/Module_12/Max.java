package Module_12;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // Get the max value in an integer array
        Scanner in = new Scanner(System.in);
        System.out.print("What the size that you want for array? ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        // Find the max value in the array
//        int max = max(arr);
//        System.out.println("Max value in " + Arrays.toString(arr) + " is " + max);
        System.out.print("Enter the range of start and end index: ");
        int start = in.nextInt();
        int end = in.nextInt();
        // Find the max value in the range of the array
        int max = maxRange(arr, start, end);
        System.out.println("Max value in range " + start + " to " + end + " in "
                            + Arrays.toString(arr) + " array is " + max);
    }

    // Max value in a range in an array
    public static int maxRange(int[] arr, int first, int end){
        if (first > end){
            return -1;
        }
        int max = 0;
        // Iterate trough first to end index to get the max value in this range
        for (int i = first; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Max value in an array
    public static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
