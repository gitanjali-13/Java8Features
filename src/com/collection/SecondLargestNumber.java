package com.collection;

public class SecondLargestNumber {
    public String secondLargest(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            if (i == num - 1) {
                System.out.println("second largest is : " + arr[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int a[] = {5, 99, 3, 65, 1, 2, 55, 87, 57, 45};
        int n = 2;
        System.out.println("second largest number :");
        SecondLargestNumber scl = new SecondLargestNumber();
        scl.secondLargest(a, n);
    }
}

