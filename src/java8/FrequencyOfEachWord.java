//4) How do you find frequency of each element in an array or a list?
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> result = stringList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("result - " + result);


        //doing some code changes ...

    }
}
