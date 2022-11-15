package com.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumStartWith1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("23");
        list.add("33");
        list.add("13");
        list.add("53");
        list.add("63");
        list.add("73");
        list.add("11");
        list.add("10");
        List<String> list1 = list.stream().filter(p -> p.startsWith("1")).collect(Collectors.toList());
        System.out.println(list1);
// using foreach loop

        List<String> list2 = Arrays.asList("13", "10", "17", "23", "92", "15", "53", "46", "87", "68");
        list2.stream().map(a -> a + " ").filter(a -> a.startsWith("1")).forEach(System.out::println);
    }
}

