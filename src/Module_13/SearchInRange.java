package Module_13;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 64, 53, 54, 109, 121, 502};
        int index = linearSearch(arr, 109, 1, 7);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int target, int start, int end) {
        // Check if the length of the array is 0 or not
        if (arr.length == 0){
            return -1;
        }

        // For loop for go through every index from start to end to check the value of each index
        for (int i = start; i <= end; i++) {
            // Check whether the value of target is exist or not
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
