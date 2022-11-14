package com.lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one","Two","Theree","One");

//		//findAny()
//		Optional<String>ele=list.stream().findFirst();
//		System.out.println(ele.get());

        //findFirst()
        Optional<String> ele = list.stream().findFirst();
        System.out.println(ele.get());
    }
}
