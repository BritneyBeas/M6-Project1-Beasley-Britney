package com.company;

import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String[] myarr1 = new String[5];

        for(int i = 0; i < myarr1.length; i++) {
        System.out.println("Please enter a word:");

        String word = myScanner.nextLine();
            myarr1[i] = word;
        }
        for(String element: myarr1) {
            System.out.println(element);

        }


    }
}

