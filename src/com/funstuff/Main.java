package com.funstuff;

public class Main {

    public static void main(String[] args) {


    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 14; j++) {
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
