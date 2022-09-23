package Module_11;

import java.util.Scanner;

import static java.lang.System.exit;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Enter a three-digit number
        System.out.print("Enter a three digit number: ");
        int num = in.nextInt();
        int len = String.valueOf(num).length();
        if (len != 3){
            System.out.println("Invalid number!");
            System.exit(1);
        }
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
    }

    /*
    A armstrong number is something that the qube of each digit sum
    will be number itself.
     */
    public static boolean isArmstrong(int n){
        int tempNum = n;
        int sum = 0;
        while (0 < n){
            int digit = n % 10;
            int qube = digit * digit * digit;
            sum += qube;
            n /= 10;
        }

        return sum == tempNum;
    }
}
