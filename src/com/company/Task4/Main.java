package com.company.Task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binary = sc.nextLine();
        int bin = Integer.parseInt(binary, 2);
        System.out.println("Число в десятичном формате: " + bin);
    }
}
