package com.javaonlinecourse.b3lesson3.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author emitrohin
 * @version 1.0
 *          25.11.2016
 *
 *  Реализовать программу, которая на вход принимает
 *  n чисел и выводит их в убывающем порядке.
 *
 *  Дополнительно: реализовать флаг, по которому можно
 *  выводить в возрастающем порядке
 */
public class CW05 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int[] anArray;
        anArray = new int[5];
        for (int i = 0; i <5 ; i++) {
            anArray[i] = Integer.parseInt(reader.readLine());

        }

        for (int i = 0; i <5 ; i++){
            for (int j = i+1; j <5; j++){

                if (anArray[j]<anArray[i]){
                    int b =anArray[i];
                    anArray[i]=anArray[j];
                    anArray[j]=b;
                }
            }

        }
        for (int i = 0; i <5 ; i++)
        {
            System.out.println(anArray[i]);
        }
    }
}
