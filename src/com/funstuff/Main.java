package com.funstuff;

public class Main {

    public static void main(String[] args) {

    /* tree cone */

    for (int i = 0; i < 7; i++) {   //how high tree will be
        for (int j = 0; j < 14; j++) {  //how wide bottom level will be (it's 2 * tree high)
            if (j < 7 - i || j > 7 + i) {   //7 is middle of the tree, this line implies boundaries of the tree
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
            //System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();

    }

        /* tree trunk */
        for (int trunkLevel = 0; trunkLevel < 2; trunkLevel++) {
            for (int trunkWidth = 0; trunkWidth < 14; trunkWidth++) {
                if (trunkWidth < 6 || trunkWidth > 8) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
