package com.collection;

import java.util.Arrays;

public class RemoveDuplicate {
    public void removeDuplicate(int[] arr) {
        System.out.println("Original Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int elements = arr.length;

        for (int i = 0; i < elements; i++) {
            for (int j = i + 1; j < elements; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[elements - 1];
                    elements--;
                    j--;
                }
            }
        }
        int[] temp = Arrays.copyOf(arr, elements);
        System.out.println();
        System.out.println("After removing duplicate elements : ");
        for (int i = 0; i < temp.length; i++) {
            ;
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 1, 6, 5, 1, 2, 2, 9, 8, 7, 1};
        RemoveDuplicate rd = new RemoveDuplicate();
        rd.removeDuplicate(arr);

    }
}


