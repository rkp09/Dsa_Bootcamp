package Module_13;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, 17, 16, 20, 3, 2, 8};
        int min = min(arr);
        int max = max(arr);
        System.out.println("min : " + min + ", max : " + max);
    }

    public static int min(int[] arr){
        // Let's assume first number is the minimum number
        int min = arr[0];

        // Check every element in the array
        for (int i = 1; i < arr.length; i++) {
            // Check whether current element is min or not
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int max(int[] arr){
        // Let's assume first number is the maximum number
        int max = arr[0];

        // Check every element in the array
        for (int i = 1; i < arr.length; i++) {
            // Check whether current element is min or not
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
