package org.nehyshta.solutions.branch;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input RIGHT degrees PLS dont be dummy");
        int dig1 = scanner.nextInt();
        int dig2 = scanner.nextInt();

        isTriangleAndRec(dig1,dig2);
    }

    public static void isTriangleAndRec(int dig1, int dig2) {
        int dig3;
        if (dig1 + dig2 < 180) {
            dig3 = 180 - (dig1 + dig2);
            System.out.println("IsTriangle");
            if (dig1 == 90 || dig2 == 90 || dig3 == 90) {
                System.out.println("IsRectangular");
            } else {
                System.out.println("NotRectangl");
            }
        } else{
            System.out.println("NotTriangle");
        }


    }
}
