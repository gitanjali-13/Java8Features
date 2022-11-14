package com.lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birds = Arrays.asList("Peackock", "Parrot", "Crow");

        //Added the collection in stream
        Stream<String> stream1 = animals.stream();
        Stream<String> stream2 = birds.stream();

        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        for (String item : finalList) {
            System.out.println(item);
        }

    }

}

