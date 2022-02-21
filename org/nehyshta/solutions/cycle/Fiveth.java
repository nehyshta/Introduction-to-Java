package org.nehyshta.solutions.cycle;

import java.util.Scanner;

public class Fiveth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();
        double sum = 0;
        double n = 100;
        for (int i = 0; i < n; i++) {
            double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;
                n++;

            }
        }
        System.out.println(sum);

    }
}
