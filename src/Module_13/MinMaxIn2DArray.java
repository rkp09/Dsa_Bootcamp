package Module_13;

public class MinMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 53, 25, 33},
                {38, 49, 51, 500},
                {91, 99, 32, 54},
                {5, 8, 2, 92, 0 , 6}
        };

        int min = min(arr);
        int max = max(arr);
        System.out.println("min : " + min + ", max : " + max);
    }

    // Search the minimum number in 2D array
    public static int min (int[][] arr){
        // Assume that minimum number is in the row of 0 and col of 0
        int min = Integer.MAX_VALUE;
        // Go over every element in the row of the array
        for (int row = 0; row < arr.length; row++) {
            // Go over every element in the col of the array
            for (int col = 0; col < arr[row].length; col++) {
                // Check whether current element is less than min or not
                if (arr[row][col] < min){
                    // Reassign the value of min
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

    public static int max (int[][] arr){
        // Assume that maximum number is in the row of 0 and col of 0
        int max = Integer.MIN_VALUE;
        // Go over every element in the row of the array
        for (int row = 0; row < arr.length; row++) {
            // Go over every element in the col of the array
            for (int col = 0; col < arr[row].length; col++) {
                // Check whether current element is less than max or not
                if (arr[row][col] > max){
                    // Reassign the value of max
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
