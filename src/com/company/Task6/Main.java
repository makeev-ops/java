package com.company.Task6;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число : ");
            double x = sc.nextDouble();
            System.out.println("Введите число : ");
            double y = sc.nextDouble();
            System.out.println("Введите число : ");
            double z = sc.nextDouble();
            double a = (x+y+z)/3;
            System.out.println("Среднее арифметическое чисел x,y,z: " + a);
            int b = (int) (a/2);
            System.out.println("Деление среднего арифметического на 2 без остатка: " + b);
            if (b > 3)
            {
                System.out.println("Программа выполнена корректно");
            }
        }
    }
