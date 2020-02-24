package com.company.Task14;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        String element = hello();
        System.out.println("String"+"   "+"int"+"      "+"double");
        System.out.println("  "+element+"     "+ chislo(element)+"       "+drob(chislo(element)));
    }
    private static String hello()
    {
        Scanner stroka = new Scanner(System.in);
        String prov = "^-*[0-9]+[.]*[0-9]*$";
        System.out.println("Введите число с клавиауры: ");
        String rez = stroka.nextLine();
        if (rez.matches(prov))
        {
            return rez;
        }
        else
        {
            while (!rez.matches(prov))
            {
                System.out.println("Вы ввели не число! Введите число:");
                rez = stroka.nextLine();
            }
            if (rez.contains("."))
            {
                return rez.substring(0, rez.indexOf("."));
            }
            else
            {
                return rez;
            }
        }
    }
    private static int chislo(String A)
    {
        return Integer.parseInt(A);
    }

    private static double drob(int X)
    {
        return X;
    }

}
