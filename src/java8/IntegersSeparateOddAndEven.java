//1) Given a list of integers, separate odd and even numbers?

package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntegersSeparateOddAndEven {
    public static void main(String[] args) {

        List<Integer> intigerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> result = intigerList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(result);


    }
}
