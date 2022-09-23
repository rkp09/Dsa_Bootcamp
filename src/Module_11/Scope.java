package Module_11;

public class Scope {
    public static void main(String[] args) {
        int a = 10;

        {
            a = 100;
            int b = 90;
            System.out.println(a);
            System.out.println(b);
        }
        int b = 110;
        System.out.println(a);
        System.out.println(b);
    }
}
