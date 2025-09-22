package java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        Map<Character, List<Character>> result1 = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity()));

        System.out.println("result on " + result1); //{ =[ ,  ,  ,  ], a=[a, a, a], c=[c], C=[C], D=[D], e=[e, e], f=[f], h=[h], J=[J], n=[n], O=[O], o=[o], p=[p], T=[T], t=[t], v=[v], y=[y]}

        Map<Character, Long> result2 = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("result 2 - "+ result2);
    }
}
