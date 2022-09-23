package Module_11;

import java.util.Arrays;

public class VariableArgs {
    /*
    Variable argument means in a function you don't know how many
    argument will be passing
     */
    public static void main(String[] args) {
        fun("Prite", "Ridoy", "Ridhita");
        multiple(1, 2, "Prite", "Ridoy");
    }

    public static void fun(String ...v) {
        System.out.println(v[0]);
    }

    public static void multiple(int a, int b, String ...names){
        System.out.println(Arrays.toString(names));
    }
}
