package Module_12;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // two-dimensional array
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++){
            // Access to each row in the 2D array.
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
