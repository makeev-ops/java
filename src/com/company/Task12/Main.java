package com.company.Task12;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner stroka = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String rez = stroka.nextLine();
        System.out.println("Ваша строка: "+rez.replace(" ",""));
    }
}
