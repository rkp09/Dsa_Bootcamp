package Module_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Creating a 2D ArrayList
        ArrayList <ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        System.out.println("How many row and col you want?");
        System.out.print("Row: ");
        int r = in.nextInt();
        System.out.print("Col: ");
        int c = in.nextInt();

        // Initialize the row of the ArrayList
        for (int row = 0; row < r; row++) {
            list.add(new ArrayList<Integer>());
        }

        for (int row = 0; row < r; row++){
            for (int col = 0; col < c; col++) {
                list.get(row).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
