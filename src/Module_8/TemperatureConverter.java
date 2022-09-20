package Module_8;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the temperature value: ");
        double cel = scanner.nextDouble();
        double converter = (cel * 9/5) + 32;
        System.out.println(cel + " degree Celsius is equal to " + converter + " degree Fahrenheit");
    }
}
