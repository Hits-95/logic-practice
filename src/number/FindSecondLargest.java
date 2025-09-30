package number;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSecondLargest {

    // Returns the second largest number in the array, or Integer.MIN_VALUE if not found
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        // Edge case: check for null or arrays with fewer than 2 elements
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        for (int num : arr) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }

        // If all elements are the same, second largest may not be set
        if (secLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("Second largest element not found (all elements equal?)");
        }
        return secLargest;
    }

    public static int findOutSecondLargesUsingJava8(int[] arr) {

        IntStream stream = Arrays.stream(arr);
        Stream<Integer> boxed = stream.boxed();
        Stream<Integer> sorted = boxed.sorted(Collections.reverseOrder());
        Stream<Integer> distinct = sorted.distinct();
        Stream<Integer> skip = distinct.skip(1);
        Optional<Integer> first = skip.findFirst();

        return first.get();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,32,5,65,3,4,23,4,2,3,4,87, 87,8,67,5,32,4,45,6};
        try {
            int result = findOutSecondLargesUsingJava8(arr);
            System.out.println("2nd Largest number is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
