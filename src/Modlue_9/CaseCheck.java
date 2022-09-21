package Modlue_9;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        // for lowercase ascii value is 97 to 122 and uppercase ascii value is 65 to 90
        if (ch >= 97 && ch <= 122){
            System.out.println("Lowercase");
        }else if (ch >= 65 && ch <= 90){
            System.out.println("Uppercase");
        }
    }
}
