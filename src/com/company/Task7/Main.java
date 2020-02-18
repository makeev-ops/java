package com.company.Task7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 5: ");
        int number = scan.nextInt();
        final int X = 3;
        final int Y = 4;
        final int Z = 5;
        if (number == X || number == Y || number == Z)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
        {
            System.out.println("Такой константы нет!");
        }
    }
}