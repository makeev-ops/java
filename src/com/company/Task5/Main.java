package com.company.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        String param = sc.nextLine();
        int number = Integer.parseInt(param);
        System.out.println(number + " умножениние на 1");
        System.out.println(number * 2 + " умножение на 2");
        System.out.println(number * 3 + " умножение на 3");
        System.out.println(number * 4 + " умножение на 4");
        System.out.println(number * 5 + " умножение на 5");
        System.out.println(number * 6 + " умножение на 6");
        System.out.println(number * 7 + " умножение на 7");
        System.out.println(number * 8 + " умножение на 8");
        System.out.println(number * 9 + " умножение на 9");
        System.out.println(number * 10 + " умножение на 10");
    }
}
