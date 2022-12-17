package interview;

import java.util.*;
import java.util.stream.Collectors;

public class ValueLabs {
    public static void main(String args[]) {
        //Input is a string like "AAAAABBCCAA" and it should print "5A2B2C2A".
        // 5 being the continuous number of occurance for character 'A'. Same is with other characters also.

        char[] inputString = "AAAAABBCCAA".toCharArray();
        printCount(inputString);

        // find the duplicated elements in using Stream functions: Stream.of("A", "B", "B", "C", "C", "D")

        List<String> stringvalues = Arrays.asList("A", "B", "B", "C", "C", "D");


        // find the non-repeated character in it using Stream functions: String input = "Java is Awesome";
        String input = "Java is Awesome";
        //printNonRepeated(input);

        //Write a program to print 5 random numbers using forEach in Java 8?

        List<Double> randomList = new ArrayList<>();
        for (int i =0;i<5;i++)
        {
            randomList.add(Math.random());
        }
       // randomList.stream().forEach(System.out::println);


        Random randomObj = new Random();
        //randomObj.ints().limit(5).forEach(System.out::println);

       List<Integer> listOfInteger=Arrays.asList( 1, 2, 3, 4, 5);
        List<Integer> squareValues = listOfInteger.stream()
                .map(each -> each * each)
                .collect(Collectors.toList());
        //System.out.println(squareValues);

        List<String> listOfStrings = Arrays.asList( "apple", "banana", "cherry");

        //System.out.println(listOfStrings.stream().
                //collect(Collectors.groupingBy(String::length)));


    }

    public static void printCount(char[] inputString) {

        StringBuilder sb  = new StringBuilder();
        char start = inputString[0];
        int count = 1;

        for (int i=1; i<inputString.length;i++){
            if(start == inputString[i]){
                count++;
            }
            else{
                sb.append(count).append(start);
                //resetting the initial check
                start = inputString[i];
                count = 1;
            }
        }
        System.out.println(sb.append(count).append(start));
    }

    public static void printNonRepeated(String inputString) {

        Map<Character, Integer> countMap = new HashMap<>();

        char[] inputChar = inputString.toCharArray();

        for (int i = 0; i < inputChar.length; i++) {
            if (countMap.containsKey(inputChar[i])) {
                Integer value = countMap.get(inputChar[i]);
                countMap.put(inputChar[i], value + 1);
            } else {
                countMap.put(inputChar[i], 1);
            }
        }
        System.out.println(countMap.entrySet().stream()
                .filter(each -> each.getValue() < 2)
                .map(each -> each.getKey())
                .collect(Collectors.toList()));
    }


}
