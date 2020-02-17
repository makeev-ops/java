package com.company.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        String binary = sc.nextLine();
        int binary2 = Integer.parseInt(binary);
        System.out.println(binary2 * 2 + " умножение на 2");
        System.out.println(binary2 * 3 + " умножение на 3");
        System.out.println(binary2 * 4 + " умножение на 4");
        System.out.println(binary2 * 5 + " умножение на 5");
        System.out.println(binary2 * 6 + " умножение на 6");
        System.out.println(binary2 * 7 + " умножение на 7");
        System.out.println(binary2 * 8 + " умножение на 8");
        System.out.println(binary2 * 9 + " умножение на 9");
        System.out.println(binary2 * 10 + " умножение на 10");
    }
}
