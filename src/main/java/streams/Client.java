package streams;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printSum(list);
    }

    // Question 1
    // Given a list of integers, print each value in it
    public static void print(List<Integer> list) {
        list.stream().forEach((val) -> System.out.print(val + " "));
    }

    // Question 2
    // Given a list, print the square of each value
    public static void printSquare(List<Integer> list) {
        list.stream().forEach((val) -> System.out.print((val * val) + " "));
    }

    // Question 3
    // Same question as above but don't use the squaring logic in forEach
    public static void printSquare2(List<Integer> list) {
        list.stream()
                .map((val) -> val * val)
                .forEach((val) -> System.out.print(val + " "));
    }

    // Question 4
    // Print even numbers
    public static void printEvenNumbers(List<Integer> list) {
        list.stream().forEach((val) -> {
            if(val % 2 == 0) System.out.print(val + " ");
        });
    }

    // Question 5
    // Same as above but with no logic in forEach
    public static void printEvenNumbers2(List<Integer> list) {
        list.stream()
                .filter((val) -> val % 2 == 0)
                .forEach((val) -> System.out.print(val + " "));
    }

    // Question 6
    // Find all the even numbers and print their source
    public static void printEvenSquare(List<Integer> list) {
        list.stream()
                .filter((val) -> val % 2 == 0)
                .map((val) -> val * val)
                .forEach((val) -> System.out.print(val + " "));
    }

    // Question 7
    // Given a list of integers, print its sum
    public static void printSum(List<Integer> list) {
        int sum = list.stream()
                .reduce(0, (currentElement, currentSum) -> {
                    return currentSum + currentElement;
                });
        System.out.println(sum);
    }

}
