package org.nehyshta.solutions;

import java.util.Scanner;

public class first {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a = s.nextInt();
        float b = s.nextInt();
        float c = s.nextInt();

        float z = ((a-3)*b/2)+c;
        System.out.printf("z is %.0f", z);
    }
}

