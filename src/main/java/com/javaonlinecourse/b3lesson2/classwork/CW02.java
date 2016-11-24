package com.javaonlinecourse.b3lesson2.classwork;

/**
 * Author: E_Mitrohin
 * Date:   23.11.2016.
 */
public class CW02 {
    public static void main(String[] args) {

        boolean condition1 = true;
        int i;

        if (condition1) {
            i = 5;
        } else {
            i = 6;
        }

        //тернарный оператор
        i = (i > 6) ? 10 : getInt();
    }

    static boolean pick(){ return false;}

    static int getInt(){ return 0;}
}
