package org.nehyshta.solutions.linear;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x= scanner.nextFloat();
        y= scanner.nextFloat();

        findSol(x,y);
    }

    public  static  void findSol(float x, float y){
        float z = (float) (((Math.sin(x)+Math.cos(y))/Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        System.out.println(z);
    }
}
