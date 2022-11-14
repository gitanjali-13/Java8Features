package com.collection;

public class FindDuplicate {
    public void findDuplicate(int arr[]) {
        //int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[i + 1]) {
//                   int temp[j] = arr[i];
                    System.out.print(" " + arr[i]);

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 1, 6, 5, 1, 2, 2, 9, 8, 7, 1};
        //int temp[] = new int[arr];
        FindDuplicate d = new FindDuplicate();
        d.findDuplicate(arr);
    }
}

