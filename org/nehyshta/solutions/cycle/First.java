package org.nehyshta.solutions.cycle;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int x = scanner.nextInt();
        if(x>0){
            for(int i=1;i<x;i++){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
