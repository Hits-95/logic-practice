package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Hello World from Java";
        String result = reverseEachWord(input);
        System.out.println(result); // Output: "olleH dlroW morf avaJ"
    }

    public static String reverseEachWord(String str) {

        return Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
