package ru.myproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Megaprey on 10.10.2016.
 */
public class test
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(file.readLine());
        String element = "";

        while(inputStream.available() > 0)
        {
            char simbol = (char)inputStream.read();

                element += simbol;

        }
        String[] line = element.split("\r\n");
        String[] a;
        String[] b;
        String primary, foreign, primaryFirst;

        for(int i = 0; i < line.length; i++)
        {
            String result = "";
            a = line[i].split(" ");
            primary = a[0];
            foreign = a[1];
            primaryFirst = a[0];
            result += line[i];
            for(int j = i + 1; j < line.length; j++)
            {
                b = line[j].split(" ");
                if(!primaryFirst.equals(b[1]) && foreign.equals(b[0]))
                {
                    primary = b[0];
                    foreign = b[1];
                    result += " " + foreign;
                }
                else
                {
                    if (primaryFirst.equals(b[1]) && foreign.equals(b[0]))
                    {
                        primary = b[0];
                        foreign = b[1];
                        result += " " + foreign;
                        break;
                    }
                }

            }
            if(foreign.equals(primaryFirst))
            System.out.println(result);
        }
    }
}
