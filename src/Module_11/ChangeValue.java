package Module_11;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 33, 9};
        // Passed the value of the reference.
        change(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void change(int[] numbers) {
        numbers[0] = 10;
    }
}
