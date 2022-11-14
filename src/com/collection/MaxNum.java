package com.collection;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNum = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int thirdNum = sc.nextInt();

        MaxNum obj = new MaxNum();
        int result = obj.findMax(firstNum, secondNum, thirdNum);
        if (result != 0) {
            System.out.println("Maximum Number is: " + result);
        } else {
            System.out.println("Numbers are Equals");
        }
    }

    public int findMax(int firstNum, int secondNum, int thirdNum) {
        if (firstNum > secondNum && firstNum > thirdNum) {
            return firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            return secondNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            return thirdNum;
        } else {
            return 0;
        }
    }

}


