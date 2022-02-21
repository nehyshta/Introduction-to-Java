package org.nehyshta.solutions.branch;

public class Second {
    public static void main(String[] args) {
        //i tired make Scanner
        int a = 322, b = 213, c = 1002, d = 1223212;
        //some cheat way
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
        //my camph with the task
        findMax(a, b, c, d);
    }

    public static void findMax(int a, int b, int c, int d) {
        int min1, min2;
        if (a > b) {
            min1 = b;
        } else if (a < b) {
            min1 = a;
        } else {
            min1 = a;
        }

        if (c > d) {
            min2 = d;
        } else if (c < d) {
            min2 = c;
        } else {
            min2 = c;
        }
        if (min1 > min2) {
            System.out.println("min1 > min2 and = " + min1);
        } else if (min2 > min1) {
            System.out.println("min2>min1 and = " + min2);
        } else {
            System.out.println("min1 == min2 and = " + min1);
        }
    }
}
