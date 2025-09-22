//2) How do you remove duplicate elements from a list using Java 8 streams?

package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateDlements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> result = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
