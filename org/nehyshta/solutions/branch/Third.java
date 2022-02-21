package org.nehyshta.solutions.branch;

public class Third {
    public static void main(String[] args) {
        int x1 = 3, x2 = 2, x3 = 1, y1 = 4, y2 = 5, y3 = 2;
        System.out.println(isLie(x1, y1, x2, y2, x3, y3));
    }

    public static boolean isLie(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (((y3 - y1) / (y2 - 1)) == ((x3 - x1) / (x2 - x1))) {
            return true;
        } else {
            return false;
        }
    }
}
