package String;

public class RotationOfString {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";

        System.out.println(rotateString(s, goal)); // ✅ true
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }

}