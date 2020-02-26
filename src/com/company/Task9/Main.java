package com.company.Task9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] mas = massiv();
        System.out.println("Вывод элементов массива, умноженного на 2: ");
        cet(mas);
    }
    private static int[] massiv() {
        Scanner ball = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int foot = ball.nextInt();
        int[] corner = new int[foot];
        for (int i = 0; i < foot; i++) {
            System.out.println("Введите значение" + " " + i + " " + "элемента массива = ");
            corner[i] = ball.nextInt();
        }
        return corner;
    }
    private static void cet (int[] massiv_1)
    {
        for (int i = 0; i < massiv_1.length; i++)
        {
            System.out.println("[" + i + "] = " + massiv_1 [i] * 2);
        }
    }
}