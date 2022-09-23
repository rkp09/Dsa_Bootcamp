package Module_11;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean isPrime = isPrime(in.nextInt());
        System.out.println(isPrime);

    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int i = 2;
        while (i * i <= n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
