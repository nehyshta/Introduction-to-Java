package org.nehyshta.solutions.linear;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        System.out.println(isInArea(x, y));
    }

    public static boolean isInArea(float x, float y) {
        return (x >= -4) && (x <= 4) && (y >= -3) && (y <= 0) || ((x >= 2) && (x <= 2) && (y <= 4) && (y > 0));
    }
}
