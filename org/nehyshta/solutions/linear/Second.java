package org.nehyshta.solutions.linear;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        a= scanner.nextFloat();
        b= scanner.nextFloat();
        c= scanner.nextFloat();
        findSol(a,b,c);
    }

    public static void findSol(float a, float b, float c) {
        float z = (float) (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.println(z);
    }
}
