package com.lambdaStream;

import java.util.StringJoiner;

public class DemoStringJoiner {

    public static void main(String[] args) {
        StringJoiner joinNames =new StringJoiner(",");// passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Rahim");

        System.out.println(joinNames);
    }
}

