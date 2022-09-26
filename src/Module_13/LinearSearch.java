package Module_13;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 13, 21, 9, 2, 10, 56, 32, 243};
        int index = search(arr, 532);
        System.out.println(index);
    }
    public static int search(int[] arr, int target) {
        // Check if the length of the array is 0 or not
        if (arr.length == 0){
            return -1;
        }

        // For loop for go through every index to check the value of each index
        for (int i = 0; i < arr.length; i++) {
            // Check whether the value of target is exist or not
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
