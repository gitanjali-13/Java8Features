package com.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod2 {
    public static void main(String[] args) {

        //condtion in list name are grater than 6 and less than 5
        List<String> names= Arrays.asList("Amod","Ashish","Neha","Nitesh","Shubham","Haresh","Umesh");
        List<String> longName = new ArrayList<String>();
        longName=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(longName); //OR

        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
    }
}
