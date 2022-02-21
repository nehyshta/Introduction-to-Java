package org.nehyshta.solutions.cycle;

import java.math.BigInteger;

public class Fourth {
    public static void main(String[] args) {
        BigInteger mult = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            mult = mult.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(mult);
    }
}
