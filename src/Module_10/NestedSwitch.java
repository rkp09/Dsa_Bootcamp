package Module_10;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // nested switch statement
        Scanner in = new Scanner(System.in);
        // Parental department id
        System.out.print("Enter your parental id: ");
        int pdId = in.nextInt();
        // Department id
        System.out.print("Enter your department id: ");
        int dId = in.nextInt();
        System.out.println();

        switch (pdId) {
            case 1 -> {
                // Chemistry
                System.out.println("Parental: chemistry.");
                switch (dId) {
                    case 1 -> System.out.println("Bio-chemistry.");
                    case 2 -> System.out.println("Organic.");
                    case 3 -> System.out.println("Inorganic.");
                    default -> System.out.println("Invalid Chemistry department!");
                }
            }
            case 2 -> {
                // Engineering
                System.out.println("Parental: Engineering.");
                switch (dId) {
                    case 1 -> System.out.println("CSE.");
                    case 2 -> System.out.println("Electrical.");
                    case 3 -> System.out.println("Electronics.");
                    default -> System.out.println("Invalid Engineering Department!");
                }
            }
            default -> System.out.println("Invalid Parental department id!");
        }
    }
}
