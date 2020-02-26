package com.company.Task10;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] mas = massiv();
        System.out.println("Вывод элементов массива первой строки, умноженных на 3: ");
        cet(mas);
    }
    private static int[][] massiv() {
        Scanner ball = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int foot = ball.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int foot1 = ball.nextInt();

        int[][] corner = new int[foot][foot1];
        for (int i = 0; i < foot; i++)
        {
            for (int j = 0; j < foot1; j++) {
                System.out.println("Введите значение [" + j + "] строки [" + i + "]= ");
                corner[i][j] = ball.nextInt();
            }
        }
        return corner;
    }
    private static void cet (int[][] massiv_1)
    {
        for (int i = 0; i < massiv_1[0].length; i++)
        {
            System.out.println("[0][" + i + "] = " + massiv_1 [0][i] * 3);
        }
    }
}