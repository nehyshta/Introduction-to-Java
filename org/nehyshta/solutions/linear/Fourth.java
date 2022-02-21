package org.nehyshta.solutions.linear;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number in nnn,mmm format: ");
        double x = scanner.nextDouble();
        doSomeMagic(x);
    }

    public static void doSomeMagic(double x){
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
