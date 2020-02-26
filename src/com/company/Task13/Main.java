package com.company.Task13;
import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner stroka = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String rez = stroka.nextLine();
        System.out.println("Введите вторую строку: ");
        String rez_1 = stroka.nextLine();
        if (rez.length() == rez_1.length())
        {
            System.out.println("Введенные строки равны по длине");
        }
        else if (rez.length() > rez_1.length()) {
                System.out.println("Строка с наибольшей длиной: " + rez);
            }
        else
            {
                System.out.println("Строка с наибольшей длиной: " + rez_1);
            }
        }
    }
