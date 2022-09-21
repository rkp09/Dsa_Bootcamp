package Modlue_9;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        // Q: Reverse the number in the input
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
//        String strNum = String.valueOf(n);
//        int len = strNum.length();
//        String reverse = "";
//        for (int i = len - 1; i >= 0; i--){
//            reverse += strNum.charAt(i);
//        }
//
//        System.out.println(Integer.parseInt(reverse));

        long reverse = 0;
        while (n > 0){
            long digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
