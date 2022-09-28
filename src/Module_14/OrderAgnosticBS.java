package Module_14;
/*
Order agnostic means that we don't know whether the array is
in ascending order or descending order
 */
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-16, -9, -5, -3, 2, 5, 7, 8, 9, 15, 22, 29};
        int[] arr = {99, 88, 85, 53, 48, 33, 29, 22, 7, -2, -5};
        int ans = orderAgnosticBS(arr, 29);
        System.out.println(ans);
    }

    public static int orderAgnosticBS (int[] arr, int target){
        // start and end just store the index of the current range in search
        int start = 0;
        int end = arr.length - 1;

        // Need to make sure that whether the array is in ascending or in descending order
        boolean isAsc = arr[start] < arr[end];

        // Check until start is less than or equal to end
        while (start <= end){
            /*
            Mid-point : store the index value of the mid number index.
            It can be achieved by (start + end) / 2.
            Since int has a fixed size so achieve the same result using
            another approach like mid = start + (end - start) / 2
             */
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                // If target is less than mid then go left
                if (target < arr[mid]){
                    end = mid - 1;
                }else if (target > arr[mid]){// If target is greater than mid then go right
                    start = mid + 1;
                }
            }else{
                // If target is less than mid then go left
                if (target > arr[mid]){
                    end = mid - 1;
                }else if (target < arr[mid]){// If target is greater than mid then go right
                    start = mid + 1;
                }
            }
        }

        // return - 1 if target does not exist in this array
        return -1;
    }
}
