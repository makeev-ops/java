package com.company.Task18;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] agrs) throws IOException
    {
        FileReader map = new FileReader("zadanie.txt");
        BufferedReader map_1 = new BufferedReader(map);
        int i = 0;
        int j = 0;
        String stroka;
        while ((stroka = map_1.readLine()) !=null)
        {
            i++;
            System.out.println(stroka);
        }
        System.out.println("Количество строк в файле для перезаписи = " + i);

        FileWriter rockstar_1 = new FileWriter("zadanie.txt");
        BufferedWriter stop = new BufferedWriter(rockstar_1);
        BufferedReader crot = new BufferedReader(new InputStreamReader(System.in));
        while (j != i)
        {
            System.out.println("Введите " + (j + 1)+" строку в файл");
            String poker = crot.readLine();
            stop.write(poker + "\r\n");
            j++;
        }
        map_1.close();
        crot.close();
        stop.close();
    }
}
