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
 * Ввести строки с клавиатуры и добавить их в список.
 * Вводить с клавиатуры строки, пока пользователь не введёт строку "stop".
 * “end” не учитывать.
 * Вывести строки на экран, каждую с новой строки и задом наперед.
 */
public class CW03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("stop")) break;
            else list.add(s);
        }

        for (String s : list) System.out.println(s);
    }
}
