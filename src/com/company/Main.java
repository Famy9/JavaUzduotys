package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner skaneris = new Scanner(System.in);
        int a;
        int b = 0;
        do {
            System.out.println("Iveskite skaicius: ");
            a = skaneris.nextInt();
            if (a != 0) {

                b += a;
            } else {
                System.out.println(b);
                return;
            }
        }while (a != 0);
        //Do be While neveiks

        // write your code here
    }
}
