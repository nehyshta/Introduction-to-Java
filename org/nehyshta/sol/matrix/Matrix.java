package org.nehyshta.sol.matrix;

import java.util.*;

//ну все она не оставляет комментарии
// НА КОСТЕР
public class Matrix {
    public static void main(String[] args) {
        //System.out.println("Дана матрица. Вывести на экран нечетные столбцы, у которых первый элемент больше последнего.");
        //task1();

        //System.out.println("Дана матрица. Вывести элементы, стоящие на диагонали");
        //task2();

        //System.out.println("Дана матрица. Вывести k строку и p столбец");
        //task3();

        //System.out.println("Сформировать квадратную матрицу порядка n (n - четное) по заданному образцу"+
        // " 1 2 3 4 5
        //   5 4 3 2 1
        //   1 2 3 4 5
        //   5 4 3 2 1
        //   1 2 3 4 5");
        //task4();

        //System.out.println("Сформировать квадратную матрицу порядка n (n - четное) по заданному образцу" +
        // "1 1 1 1 1
        // 2 2 2 2 0
        // 3 3 3 0 0
        // 4 4 0 0 0
        // 5 0 0 0 0
        // 6 0 0 0 0");
        //task5();

        //System.out.println("Сформировать матрицу по заданному образцу" +
        // "1 1 1
        //  0 1 0
        //  1 1 1");
        //task6();

        //System.out.println("Сформировать квадратичную матрицу по форме arr[i][j] = i^2-j^2/n");
        //task7();

        //System.out.println("Поменять столбцы местами. Номера столбцов вводятся с клавиатуры");
        //task8();

        //System.out.println("В неотрицательной матрице найти сумму элементов каждого столбца. Найти максимальную сумму");
        //task9();

        //System.out.println("Найти положительные элементы в диагонали матрицы");
        //task10();

        // System.out.println("Матрицу 10 на 20 заполнить случайными числами от 0 до 15. Вывести на экран матрицу и номера строк,"+
        //        " в которых число 5 встречается 3 и более раз");
        //task11();

        //System.out.println("Отсортировать строки матрицы по возрастанию и убыванию значений элементов");
        //task12();

        //System.out.println("Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов");
        //task13();

        //System.out.println("Заполнить матрицу рандомно нулями и единицами, однако количество единиц в столбце должно быть равно столбцу.");
        //task14();

        //System.out.println("Найти наибольший элемент матрицы и заменить все нечетные элементы на него");
        //task15();

        //System.out.println();
        //task16();

    }

    public static void task1() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat.length; j += 2) {
                if (mat[0][j] < mat[mat.length - 1][j]) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }


    }

    public static void task2() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                if (i == j)
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void task3() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int k = scanner.nextInt();
        System.out.println("Input column: ");
        int p = scanner.nextInt();

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[k][i] + " ");
        }

        System.out.println();
        System.out.println();

        for (int j = 0; j < mat.length; j++) {
            System.out.println(mat[j][p]);
        }

    }

    public static void task4() {

        int[][] mat = new int[6][6];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = j + 1;
            }
        }


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < mat.length; i++) {
            int n = mat.length - 1;
            for (int j = 0; j < mat.length; j++) {
                if (i % 2 != 0 && n >= 0) {
                    mat[i][j] = mat[i - 1][n--];

                }
            }
        }

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task5() {
        int[][] mat = new int[6][6];

        System.out.println();

        int n = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length - n; j++) {
                mat[i][j] = i + 1;
            }
            n++;
        }

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[][] mat = new int[5][5];

        for (int i = 0, k = 0, l = mat.length; i <= (mat.length - 1) / 2; i++, k++, l--) {
            for (int j = k; j < l; j++) {
                mat[i][j] = 1;
            }
        }

        for (int i = mat.length - 1, k = 0, l = mat.length; i > (mat.length - 1) / 2; i--, k++, l--) {
            for (int j = k; j < l; j++) {
                mat[i][j] = 1;
            }
        }

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task7() {
        int[][] mat = new int[5][5];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) Math.round(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / mat.length));
                if (mat[i][j] > 0) {
                    sum++;
                }
            }
        }


        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        System.out.println("Sum is " + sum);
    }

    public static void task8() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first column: ");
        int column1 = scanner.nextInt();
        System.out.println("Input second column: ");
        int column2 = scanner.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                int temp = mat[i][column1];
                mat[i][column1] = mat[i][column2];
                mat[i][column2] = temp;

            }
        }


        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task9() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[] sum = new int[mat.length];
        int max = sum[0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                sum[j] += mat[i][j];
                if (sum[j] > max) {
                    max = sum[j];
                }
            }

        }


        System.out.println();
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("max is " + max);

    }

    public static void task10() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt() % 5 - 1;
            }
        }
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("More than 0 :");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j && mat[i][j] > 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }

    public static void task11() {
        int[][] mat = new int[10][20];
        Random random = new Random();
        int k = 0;
        int count = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(15);
            }
        }

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("raw where 5 meets >=3 times: ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 5) {
                    count++;

                }
                if (count >= 3 && k == 0) {
                    System.out.println("i = " + (i + 1));
                    k++;
                }

            }
            k = 0;
            count = 0;
        }

    }

    public static void task12() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }

        System.out.println("matrix: ");

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sorting...");
        int temp;
        for (int k = 0; k < mat.length; k++) {

            for (int i = 0; i < mat.length - 1; i++) {

                for (int j = 0; j < mat.length - i - 1; j++) {

                    if (mat[k][j] > mat[k][j + 1]) {
                        temp = mat[k][j];
                        mat[k][j] = mat[k][j + 1];
                        mat[k][j + 1] = temp;
                    }
                }
            }
        }
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("sorting again..");
        for (int k = 0; k < mat.length; k++) {
            for (int i = 0; i < mat.length - 1; i++) {
                for (int j = 0; j < mat.length - i - 1; j++) {
                    if (mat[k][j] < mat[k][j + 1]) {
                        temp = mat[k][j];
                        mat[k][j] = mat[k][j + 1];
                        mat[k][j + 1] = temp;
                    }
                }
            }
        }

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void task13() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }

        System.out.println("matrix: ");

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sorting...");
        int temp;

        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat.length - 1; k++) {


                for (int j = 0; j < mat.length; j++) {

                    if (mat[k][j] > mat[k + 1][j]) {
                        temp = mat[k][j];
                        mat[k][j] = mat[k + 1][j];
                        mat[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println();
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


        System.out.println();
        System.out.println("sotring again...");


        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat.length - 1; k++) {


                for (int j = 0; j < mat.length; j++) {

                    if (mat[k][j] < mat[k + 1][j]) {
                        temp = mat[k][j];
                        mat[k][j] = mat[k + 1][j];
                        mat[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println();
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


    }

    public static void task14() {
        int[][] mat = new int[4][2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

            }
        }

    }

    public static void task15() {
        int[][] mat = new int[5][5];
        Random random = new Random();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }

        System.out.println("matrix: ");

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        int max = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j] %2==1) {
                    mat[i][j] = max;
                }
            }
        }
        System.out.println("max = " + max);
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void task16(){


    }

}

