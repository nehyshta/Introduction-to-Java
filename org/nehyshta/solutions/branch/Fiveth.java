package org.nehyshta.solutions.branch;

import java.util.Scanner;

public class Fiveth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        findF(x);
    }

    public static void findF(int x) {
        float y;
        if (x <= 3) {
            y = (float) Math.pow(x, 2) - 3 * x + 9;
            System.out.println(y);

        } else if (x > 3) {
            y = (float) (1 / Math.pow(x, 3) + 6);
            System.out.println(y);
        }

    }
}
