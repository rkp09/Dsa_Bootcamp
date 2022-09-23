package Module_11;

public class FunctionOverload {
    public static void main(String[] args) {
        func(9);
        func("Prite Rani Dey");
    }

    public static void func(int a) {
        System.out.println("First func.");
        System.out.println("value : " + a);
    }

    public static void func(String name){
        System.out.println("Second func.");
        System.out.println("value: " + name);
    }

}
