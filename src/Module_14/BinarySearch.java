package Module_14;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-16, -9, -5, -3, 2, 5, 7, 8, 9, 15, 22, 29};
        int ans = binarySearch(arr, 22);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        // start and end just store the index of the current range in search
        int start = 0;
        int end = arr.length - 1;
        // Check until start is less than or equal to end
        while (start <= end){
            /*
            Mid-point : store the index value of the mid number index.
            It can be achieved by (start + end) / 2.
            Since int has a fixed size so achieve the same result using
            another approach like mid = start + (end - start) / 2
             */
            int mid = start + (end - start) / 2;

            // If target is less than mid then go left
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){// If target is greater than mid then go right
                start = mid + 1;
            }else{
                return mid;
            }
        }

        // return - 1 if target does not exist in this array
        return -1;
    }
}
