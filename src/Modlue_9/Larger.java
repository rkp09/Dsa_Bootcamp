package Modlue_9;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//
//        if (c > max){
//            max = c;
//        }
        int max = Math.max(Math.max(a, b), c);
        System.out.println(max);

    }
}
