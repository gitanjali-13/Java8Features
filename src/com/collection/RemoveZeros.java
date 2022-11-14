package com.collection;

public class RemoveZeros {

    public static void main(String[] args) {
        String str = "s00u0j0i00t";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}

