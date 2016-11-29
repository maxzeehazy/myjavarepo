package com.javaonlinecourse.b3lesson3.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author emitrohin
 * @version 1.0
 *          25.11.2016
 *
 * Переставить X первых строк в конец списка
 *
 * C клавиатуры ввести 2 числа X и Y
 * Ввести X строк и заполнить ими список.
 * Переставить Y строк c начального индекса в конец списка.
 * Вывести список на экран.
 */

public class CW02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            list.add(reader.readLine());
        }
        for(int i = 0; i < m; i++)
        {
            list.add(list.remove(0));
        }
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
