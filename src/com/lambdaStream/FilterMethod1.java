package com.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod1 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumberList = new ArrayList<Integer>();

        //without using streams
        for(int n:numberList) {
            if(n%2==0) {
                evenNumberList.add(n);
            }
        }
        System.out.println(evenNumberList);

        evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //the forEach method read the every elements after filter
        numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));//consumer method
        //OR

        numberList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
