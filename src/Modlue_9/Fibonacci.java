package Modlue_9;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Q: print the nth number of a fibonacci series
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i < N; i++){
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println("Number of " + N + "th position of the fibonacci series is " + b);
    }
}
