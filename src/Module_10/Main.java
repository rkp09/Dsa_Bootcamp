package Module_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String car = in.next().trim();

//        switch (car){
//            case "Toyota":
//                System.out.println("Made in Japan.");
//                break;
//
//            case "Tesla":
//                System.out.println("Made in USA.");
//                break;
//
//            case "Audi":
//                System.out.println("Made in German.");
//                break;
//
//            case "Jaguar":
//                System.out.println("Made in England.");
//                break;
//
//            case "Porche":
//                System.out.println("Made in Italy.");
//                break;
//
//            default:
//                System.out.println("Invalid car name!");
//        }

        switch (car) {
            case "Toyota" -> System.out.println("Made in Japan.");
            case "Tesla" -> System.out.println("Made in USA.");
            case "Audi" -> System.out.println("Made in German.");
            case "Jaguar" -> System.out.println("Made in England.");
            case "Porche" -> System.out.println("Made in Italy.");
            default -> System.out.println("Invalid car name!");
        }
    }
}
