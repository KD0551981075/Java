package interview;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValueLabsTestPractice {

    public static void main(String args[]) {
        printCount();
        printDuplicates();
        printNonDuplicates();
        printRandomValues();

    }

    static void printCount() {
        String inputString = "AAAAABBCCAA";

        StringBuilder strBuilder = new StringBuilder();
        char currentValue = inputString.charAt(0);
        int count = 1;

        //output 5A2B2C2A
        for (int i = 1; i < inputString.length(); i++) {
            char tempValue = inputString.charAt(i);
            if (tempValue == currentValue)
                count++;
            else {
                strBuilder.append(count).append(currentValue);
                currentValue = tempValue;
                count = 1;
            }
        }
        strBuilder.append(count).append(currentValue);

        System.out.println(strBuilder.toString());
    }

    static void printDuplicates() {

        List<String> output = Stream.of("A", "B", "B", "C", "C", "D")
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .collect(Collectors.toList());

        System.out.println(output);
    }

    static void printNonDuplicates() {
        String inputValues = "Java is Awesome";

        List<Character> output = inputValues.toLowerCase().chars()
                .mapToObj(each -> (char) each)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(each -> each.getValue() == 1)
                .map(each -> each.getKey())
                .collect(Collectors.toList());

        System.out.println(output);


    }

    static void printRandomValues() {
        Random randomObj = new Random();
        randomObj.ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
