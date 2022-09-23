package Module_11;

public class SwapStr {
    public static void main(String[] args) {
        String name = "Prite";
        change(name);
        // String can't be changed because String is final.
        System.out.println(name);
    }

    private static void change(String name) {
        name = "Prite Dey";
    }
}
