package com.lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveWithoutStream {
    Scanner scanner = new Scanner(System.in);

    public boolean removeElement(List<String> list) {
        System.out.println("Enter String to remove");
        String name = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                list.remove(name);
                return true;
            }
        }
        System.out.println(list);
        return false;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gitanjali");
        list.add("deshmukh");
        list.add("Sneha");
        list.add("shweta");
        list.add("priti");
        System.out.println(list);

        RemoveWithoutStream removeDemo = new RemoveWithoutStream();
        boolean result = removeDemo.removeElement(list);
        if (result) {
            System.out.println("Element remove successfully.");
            System.out.println(list);
        } else {
            System.out.println("string not found.");
        }

    }
}


