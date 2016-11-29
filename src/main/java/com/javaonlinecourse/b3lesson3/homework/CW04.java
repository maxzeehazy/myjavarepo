package com.javaonlinecourse.b3lesson3.homework;

/**
 * @author emitrohin
 * @version 1.0
 *          25.11.2016
 *
 * Написать программу, которая ведёт обратный отсчёт
 * с 60 до 0, и в конце выводит на экран текст «Ваше время истекло!».
 * Программа должна уменьшать число 1 раз в секунду.
 *
 * Воспользуйся следущей помощью:
 * Thread.sleep(1000); задержка на одну секунду.
 *
 */
public class CW04 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=60;i>=0;i--)
        {  Thread.sleep(100);
            System.out.println(i);
        }

        System.out.println("Ваше время истекло!");
    }
}