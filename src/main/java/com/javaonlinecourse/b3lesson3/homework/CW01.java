package com.javaonlinecourse.b3lesson3.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author emitrohin
 * @version 1.0
 *          25.11.2016
 *
 * Вывести числа в обратном порядке
 *
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Используя цикл for вывести их в обратном порядке.
 */
public class CW01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            int c = Integer.parseInt(s);
            list.add(c);
        }
        for (int i = 10 - 1; i >= 0 ; i--) {

            System.out.println(list.get(i));

        }
    }
}
