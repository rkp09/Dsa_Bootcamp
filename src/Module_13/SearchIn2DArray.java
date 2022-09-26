package Module_13;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 23, 53, 25, 33},
                {38, 49, 51},
                {91, 99, 32, 54},
                {5, 8, 92, 6}
        };

        int[] ans = search(arr, 53);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search (int[][] arr, int target){
        if(arr.length == 0){
            return new int[] {-1, -1};
        }
        // Go over every row
        for (int row = 0; row < arr.length; row++) {
            // Go over every column
            for (int col = 0; col < arr[row].length; col++) {
                // Check whether the element of the array is equal to target
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
