package com.collection;

import java.util.Scanner;
public class CheckOcc {
    public void checkOccurance(String string, char ch) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurance of Character is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = sc.next().toLowerCase();
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        CheckOcc sample = new CheckOcc();
        sample.checkOccurance(string, ch);

    }

}


