package com.collection;

public class Problem3<T> {
    public void method(T[] arr) {
        for (T s : arr) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] strings = {"sujit", "soham", "raj"};

        Problem3 p3 = new Problem3();
        p3.method(integers);
        System.out.println();
        p3.method(strings);
    }
}

