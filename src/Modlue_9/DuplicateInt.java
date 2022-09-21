package Modlue_9;

import java.util.Scanner;

public class DuplicateInt {
    public static void main(String[] args) {
        // Q: Duplicate integer in a number
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int dig = in.nextInt();
        int count = 0;
        while (num > 0){
            if (num % 10 == dig){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
