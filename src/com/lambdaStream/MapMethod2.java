package com.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethod2 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,3,4,5);
        List<Integer> multiPliedList = new ArrayList<Integer>();

        //before jav8 or without stream
		/*for(int num :numberList) {
		 * multiPliedList.add(num*3)
			System.out.println(multiPliedList);
		}*/
        //Using the stream map method
        //multiPliedList=numberList.stream().map(n-> n*3).collect(Collectors.toList());
        //System.out.println(multiPliedList);
        //OR without store list target list
        numberList.stream().map(n-> n*3).forEach(number->System.out.println(number));
    }
}
