package com.company.Task6;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число x: ");
            double x = scan.nextDouble();
            System.out.println("Введите число y: ");
            double y = scan.nextDouble();
            System.out.println("Введите число z: ");
            double z = scan.nextDouble();
            double average = (x + y + z) / 3;
            System.out.println("Среднее арифметическое чисел x,y,z: " + average);
            int division = (int) (average / 2);
            System.out.println("Деление среднего арифметического на 2 без остатка: " + division);
            if (division > 3)
            {
                System.out.println("Программа выполнена корректно");
            }
        }
    }
