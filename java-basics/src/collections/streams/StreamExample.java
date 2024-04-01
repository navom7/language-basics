package collections.streams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //without using stream
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(3000);
        lst.add(41000);
        lst.add(9000);
        lst.add(1000);
        lst.add(3500);

        int count = 0;
        for(Integer salary: lst) {
            if (salary > 3000) {
                count++;
            }
        }
        System.out.println("salary more than 3000: " + count);



        //using stream
        long output = lst.stream().filter((Integer i) -> i >3000).count();
        System.out.println("using stream: " + output);
        System.out.println("without any intermediate function: " + lst.stream().count());

        // skip
        List<Integer> numbers = Arrays.asList(2,1,3,4,5,6,23);
        Stream<Integer> numberStream = numbers.stream().skip(3);
        List<Integer> outputt = numberStream.collect(Collectors.toList());
        printList(outputt, "After skip 3:");

        //maptoint how to work with stream on primitive data types
        List<String> numbers2 = Arrays.asList("2", "3", "4", "5", "6");
        IntStream numberStream2 = numbers2.stream().mapToInt((String i) -> Integer.parseInt(i));
        int[] numberArray = numberStream2.toArray();
        printArray(numberArray, "number array converted from List of string:");
        int[] numberArray2 = {2,1,4,5,6};
        IntStream numbersStream3 = Arrays.stream(numberArray2);
        int[] filteredArray = numbersStream3.filter((int val) -> val > 2).toArray();
        printArray(filteredArray, "after applying filter on intstream: ");




        //Why lazy
        List<Integer> lazyNumbers = Arrays.asList(2,1,3,1,4,5,6,7);
        //at this line sout will not happen
        Stream<Integer> lazyNumbersStream = lazyNumbers.stream().filter((Integer i) -> i > 2).peek((Integer i) -> System.out.println(i));
        //at this line sout will happen once we hit the teminal operator is invoked
        lazyNumbersStream.count();


        //TERMINAL OPERATOR
        List<BigInteger> listForTermOp = Arrays.asList(new BigInteger("1"),new BigInteger("41"),new BigInteger("1"),new BigInteger("23"));


        //1. toArray()
//        Object[] filteredNumberArrType1 = listForTermOp.stream()
//                .filter((Integer val) -> val >= 3)
//                .toArray();
//        Integer[] filteredArrOfInteger = listForTermOp.stream()
//                .filter((Integer val) -> val >= 3)
//                .toArray((int size) -> new Integer[size]);

        //2. reduce
        Optional<BigInteger> reducedValue = listForTermOp.stream()
                .reduce((BigInteger a, BigInteger b) -> a.multiply(b) );
        System.out.println("Reduced value: " + reducedValue.get());


    }

    public static void printList(List<Integer> lst, String f) {
        System.out.println("\n" + f);
        lst.forEach((Integer i) -> System.out.print(i + " "));
        System.out.println();
    }

    public static void printArray(int[] lst, String f) {
        System.out.println("\n" + f);
        for(int i: lst) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
