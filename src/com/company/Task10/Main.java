package com.company.Task10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] mas = massiv();
        System.out.print("Вывод элементов массива первой строки, умноженных на 3:\n");
        dopka(mas);
    }
    public static int[][] massiv() {
        Scanner ball = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int foot = ball.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int foot1 = ball.nextInt();

        int[][] corner = new int[foot][foot1];
        for (int i = 0; i < foot; i++)
        {
            for (int j = 0; j < foot1; j++) {
                System.out.print("Введите значение [" + j + "] строки [" + i + "]= \n");
                corner[i][j] = ball.nextInt();
            }
        }
        return corner;
    }
    private static void dopka (int[][] massiv_1)
    {
        for (int i = 0; i < massiv_1[0].length; i++)
        {
            System.out.print("[0][" + i + "] = "+massiv_1 [0][i]*3+"\n");
        }
    }
}