package com.lambdaStream;

import java.util.ArrayList;

public class PrimeEvenLambda {

    void filterEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i) + " ");
            }
        }
    }

    void primeNumber(ArrayList<Integer> list1) {
        for (int i = 1; i <= list1.size(); i++) {
            int count = 0;
            for (int j = 2; j < 1; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 10;
        for (int i = 1; i <= num; i++)    // add 1-10 number in list.
        {
            list.add(i);

        }
        System.out.println(list);
        PrimeEvenLambda sample = new PrimeEvenLambda();   // create object.
        sample.filterEven(list);    //call filterEven method using object and pass list as an argument & filter even number from list.
        System.out.println();

        //take another list , add 1-10 number in list and filter prime number.
        System.out.println("filter prime number form list.");
        ArrayList<Integer> list1 = new ArrayList<>();
        int n = 100;
        for (int i = 1; i <= n; i++) {
            list1.add(i);

        }
        PrimeEvenLambda sample1 = new PrimeEvenLambda();
        sample1.primeNumber(list1);
    }
}


