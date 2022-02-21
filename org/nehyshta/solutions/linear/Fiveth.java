package org.nehyshta.solutions.linear;

import java.util.Scanner;

public class Fiveth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you input seconds please?");
        float sec= sc.nextInt();

        formatSec(sec);

    }

    public static void formatSec(float sec){
        System.out.printf("%.2fH or %.2fM or %.2fS \n",sec/3600,sec/60%60,sec);
        System.out.printf("%.2fH  %.2fM  %.2fS",sec/3600,sec%60/60,sec%60);
    }
}
