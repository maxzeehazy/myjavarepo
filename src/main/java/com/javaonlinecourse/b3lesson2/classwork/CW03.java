package com.javaonlinecourse.b3lesson2.classwork;

/**
 * Author: E_Mitrohin
 * Date:   23.11.2016.
 *
 * Прерывание внешнего цикла
 */
public class CW03 {
    public static void main(String[] args) {
        String s = "экзистенциализм";
        boolean found = false;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                found = s.charAt(i) == s.charAt(j);
                if (found) break; //прерывает внутренний цикл
            }
            if (found) break; //прерывает внешний цикл
        }

        String я = "экзистенциализм";
        found = false;

        outerloop:
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                found = s.charAt(i) == s.charAt(j);
                if (found) break outerloop; //прерывание внешнего цикла
            }
        }

        m: {
            System.out.println();
            break m;
        }


    }
}
