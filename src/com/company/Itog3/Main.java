package com.company.Itog3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main (String agrs[]) {
        Scanner core = new Scanner(System.in);
        System.out.println("Введите курс доллара USD: ");
        try {
            double USD = core.nextDouble();
            String EU = "^[0-9]+.*[0-9]+$";
            String USD_str = Double.toString(USD);
            core.nextLine();
            if (USD_str.matches(EU)) {
                System.out.println("Введите сумму в рублях для перевода по выбранному курсу доллара SUM: ");
                double SUM = core.nextDouble();
                String SUM_str = Double.toString(SUM);
                if (SUM_str.matches(EU)) {
                    double current_USD = (double) Math.round((SUM / USD) * 100) / 100;
                    System.out.println("Ваша сумма в долларах = " + current_USD);
                } else {
                    System.out.println("Вы ввели некорректную сумму");
                }

            } else {
                System.out.println("Вы ввели некорректный курс");
            }
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Вы ввели некорректный курс или сумму");
        }
    }
}
