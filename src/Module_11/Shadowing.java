package Module_11;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        // line 4 is shadowed by line 8
        int x = 100;
        System.out.println(x);
        show();
    }

    private static void show() {
        System.out.println(x);
    }
}
