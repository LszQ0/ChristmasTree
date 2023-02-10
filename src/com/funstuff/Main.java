package com.funstuff;

public class Main {

    public static void main(String[] args) {


    for (int i = 0; i < 7; i++) {   //how high tree will be
        for (int j = 0; j < 14; j++) {  //how wide bottom level will be (it's 2 * tree high)
            if (j < 7 - i || j > 7 + i) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }

            //System.out.println("i = " + i + ", j = " + j);

        }
        System.out.println();

    }



    }
}
