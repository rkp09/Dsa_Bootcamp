package Module_13;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Prite Rani Dey";
        boolean value = search(name, 'D');
        System.out.println(value);
    }

    public static boolean search(String str, char target){
        // If the length of the String is 0
        if (str.length() == 0){
            return false;
        }

        // Check every character in the str
        for (int i = 0; i < str.length(); i++) {
            // If the current character in the array is same as target then return true
            if (str.charAt(i) == target){
                return true;
            }
        }

        // If nothing is found same as target
        return false;
    }
}
