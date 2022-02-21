package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int[] myarr1 = new int[5];

        for(int i = 0; i < myarr1.length; i++) {
            System.out.println("Please enter a number.");
            int num = Integer.parseInt(myScanner.nextLine());
            myarr1[i] = num;
        }
        for(int element: myarr1) {
            System.out.println(element);


        }

    }
}

