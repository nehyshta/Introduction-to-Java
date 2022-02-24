package org.nehyshta.sol.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dimens {
    public static void main(String[] args) {


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному");
        // task1();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //System.out.println("Дана последовательность действительных чисел аь а2,..., а„." +
        // " Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.");
        // task2();


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("Дан массив действительных чисел из N членов"+
        // "подсчитать сколько в нем отрицательных, положительных и нулевых элементов");
        //task3(5);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // System.out.println("Даны действительные числа а1,а2, . . . ,аn. Поменять местами наибольший и наименьший элементы.");
        //task4();


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("Даны целые числа a1, a2,......, an. Вывести на печать только числа, для которых ai > i");
        //task5();


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("Задана последовательность " +
        //       "N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.");
        //task6(8);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println("Даны действительные числа а1, а2, ..., аn. Найти max(a1 + a2n, a2 + a2n-1, ..., аn + an+1)");
        //task7(6);


//////////////////////////////////////////////////////////      task8       /////////////////////////////////////////////////////////////
        //System.out.println("Дана последовательность целых чисел a1,a2 , ... ,an. Образовать новую последовательность, выбросив из" +
        // " исходной те члены, которые равны min(a1,a2 , ... ,an ");
        //  task8(6);


//////////////////////////////////////////////////////////      task9       /////////////////////////////////////////////////////////////
        // System.out.println("В массиве целых чисел с количеством элементов n найти" +
        //        " наиболее встречающееся число. Если таких чисел несколько, то определить наименьший из них.");
        //task9(5);


//////////////////////////////////////////////////////////      task10       /////////////////////////////////////////////////////////////
        // System.out.println("Сжать массив, выбросив из него каждый второй элемент (заполнить нулями). Не использовать доп массив");
        //task10(8);

    }


    public static void task1() {
        int[] a = new int[]{3, 4, 2, 6};
        int k = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                System.out.println(a[i]);
            }
        }
    }

    public static void task2() {
        int count = 0;
        int[] a = new int[]{3, 4, 2, 6};
        int z = 4;
        System.out.println("Before");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println();
        System.out.println("After");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Count = " + count);
    }

    public static void task3(int n) {
        int zero = 0, pl = 0, minus = 0;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt() % 21 - 10;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > 0) {
                pl++;
            } else if (arr[i] < 0) {
                minus++;
            } else if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println();
        System.out.println("zero = " + zero + " minus = " + minus + " plus = " + pl);

    }

    public static void task4() {
        int[] n = new int[]{228, 1337, 2, 0, -2, 43, 23, 1243};
        int min = n[0];
        int max = n[0];
        int temp;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = i;
            } else if (n[i] < min) {
                min = i;

            }
        }

        temp = n[max];
        n[max] = n[min];
        n[min] = temp;

        System.out.println(Arrays.toString(n));
    }

    public static void task5() {
        int[] arr = new int[]{0, 1, 234, 234, 2, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void task6(int n) {
        int[] arr = new int[n];
        double sum = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {

                } else {
                    sum += arr[i];
                }
            }

        }
        System.out.println("sum is " + sum);

    }

    public static void task7(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        int maxSum = arr[0] + arr[arr.length - 1];
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length / 2; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > maxSum) {

                maxSum = arr[i] + arr[arr.length - i - 1];

            }
        }
        System.out.println(maxSum);

    }

    public static void task8(int n) {
        int[] arr = new int[n];
        int mCount = 0;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20);
        }

        int min = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min is " + min);

        for (int i = 0; i < n; i++) {
            if (min == arr[i]) {
                mCount++;
            }
        }

        int indRes = 0;
        int[] withoutMin = new int[arr.length - mCount];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                withoutMin[indRes] = arr[i];
                indRes++;
            }
        }
        System.out.println(Arrays.toString(withoutMin));
    }

    public static void task9(int n) {

        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {

            arr[i] = random.nextInt(3);

        }
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(count));
        int res = arr[0];
        int countRes = count[0];

        for (int i = 0; i < n; i++) {
            if (count[i] > countRes) {

                countRes = count[i];
                res = arr[i];
            }

            if ((countRes == count[i]) && (arr[i] < res)) {
                res = arr[i];
            }

        }

        System.out.println("res = " + res + " " + "cRes = " + countRes);


    }

    public static void task10(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {

            arr[i] = random.nextInt(10);

        }

        for(int i = 0; i<n; i++){
            if(i%2==0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}

