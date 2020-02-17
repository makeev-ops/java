package com.company.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        System.out.println(num * 2 + " умножение на 2");
        System.out.println(num * 3 + " умножение на 3");
        System.out.println(num * 4 + " умножение на 4");
        System.out.println(num * 5 + " умножение на 5");
        System.out.println(num * 6 + " умножение на 6");
        System.out.println(num * 7 + " умножение на 7");
        System.out.println(num * 8 + " умножение на 8");
        System.out.println(num * 9 + " умножение на 9");
        System.out.println(num * 10 + " умножение на 10");
    }
}
