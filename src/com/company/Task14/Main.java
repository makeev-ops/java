package com.company.Task14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = sk.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double)X;
        System.out.print("string: " + S + "\n" + "int: " + X + "\n" + "double: " + Y + "" + "\n");
    }
}
