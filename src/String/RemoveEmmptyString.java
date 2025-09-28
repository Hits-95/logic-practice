package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Remove empty strings from an array of strings
// Input: ["a", "", "b", "", "c", "", "d"]
// Output: ["a", "b", "c", "d"]

            public class RemoveEmmptyString {

    public static void main(String[] args) {
        String[] str = {"a", "", "b", "", "c", "", "d"};

        List<String> collect = Arrays.stream(str)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
