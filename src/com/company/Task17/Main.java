package com.company.Task17;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader map = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Если хотите закончить ввод данных, то введите слово \"стоп\"");
        try (FileWriter myfile = new FileWriter("maping"))
        {
            while (true)
            {
                String text = map.readLine();
                if(text.equals("стоп")){
                    myfile.write(text);
                    break;
                }
                else {
                    myfile.write(text +"\r\n");
                }
            }
            map.close();
        }
    }
}
