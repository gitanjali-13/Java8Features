package com.collection;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);

        FindNumber arr = new FindNumber();

        arr.even(list, list1);

        System.out.println(list1);
        System.out.println("***");
        System.out.println("25th Even Number is: " + list1.get(25));

    }

    public List even(List<Integer> list, List<Integer> list1) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}

