package Module_12;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        // Swap the element by given index
        Scanner in = new Scanner(System.in);
        // Make an array of 5 integer
        int[] arr = new int[4];
        System.out.print("Type four numbers to store it in array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Your array is now : " + Arrays.toString(arr));
        System.out.print("Do you want to swap a value with other position? Hit y or n: ");
        String ans = in.next();
        if (ans.equals("y")){
            System.out.print("Write the first index and end index to swap: ");
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            swap(arr, x, y);
        }

        System.out.println("New looking array after swap: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
