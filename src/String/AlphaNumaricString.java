package String;

public class AlphaNumaricString {

    public static boolean containsSpecialCharacter(String str) {
        String regExp = ".*[^a-zA-Z0-9].*";
        return str.matches(regExp);
    }

    public static boolean containsSpecialCharacter2(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abc123xyz456&&";


        if(containsSpecialCharacter(str)) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string is alphanumeric.");

        }
    }
}
