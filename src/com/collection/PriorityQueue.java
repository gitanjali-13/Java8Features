package com.collection;

import java.util.Iterator;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<String> queue = new java.util.PriorityQueue<>();
        queue.add("Gitanjali");
        queue.add("Deshmukh");
        queue.add("Gujarat");
        queue.add("Engineer");
        System.out.println("head = " + queue.element());
        System.out.println("head = " + queue.peek());

        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println();
        System.out.println("AFTER REMOVING ELEMENTS");
        Iterator itr1 = queue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}


