package com.company;

public class ArrayFunReverseIt {

    public static void main(String[] args) {

        int[] myarr2 = {1, 2, 3, 4, 5};

        for(int a = 0; a < myarr2.length; a++) {
            System.out.println(myarr2[a]);

        }

        int[] myarr3 = new int[5];

            // this will copy the array in reverse order

        for (int b = 0; b < myarr3.length; b++) {
            myarr3[b] = myarr2[myarr2.length - 1 - b];
            System.out.println(myarr3[b]);
        }




    }
}
