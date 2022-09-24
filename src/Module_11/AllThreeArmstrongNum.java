package Module_11;

public class AllThreeArmstrongNum {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            boolean isArmstrong = ArmstrongNumber.isArmstrong(i);
            if (isArmstrong){
                System.out.println(i);
            }
        }
    }
}
