package com.funstuff;

public class Main {

    public static void main(String[] args) {

    /* tree cone */

    for (int treeHeight = 0; treeHeight < 7; treeHeight++) {   //how high tree will be
        for (int treeWidth = 0; treeWidth < 14; treeWidth++) {  //how wide bottom level will be (it's 2 * tree high)
            if (treeWidth < 7 - treeHeight || treeWidth > 7 + treeHeight) {   //7 is middle of the tree, this line implies boundaries of the tree
                System.out.print(" ");
            }
            else {

                System.out.print("*");
            }
            //System.out.println("treeHeight = " + treeHeight + ", treeWidth = " + treeWidth);
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
