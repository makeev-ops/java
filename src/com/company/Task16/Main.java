package com.company.Task16;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] agrs)
    {
        try (FileInputStream text_1 = new FileInputStream("zadanie.txt"))
        {
            BufferedReader red_for = new BufferedReader(new InputStreamReader(text_1));
            String stroka;
            while ((stroka = red_for.readLine()) != null)
            {
                System.out.println(stroka);
            }
        }
        catch (IOException ext)
        {
            System.out.println("Ошибка ввода-вывода" + ext);
        }
    }
}