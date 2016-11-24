package com.javaonlinecourse.b3lesson2.classwork;

/**
 * Author: E_Mitrohin
 * Date:   23.11.2016.
 */
public class CW01 {
    public static void main(String[] args) {
        boolean condition1 = true, condition2 = false;
        // По правилам синтаксиса Java else относится к самому внутреннему if
        if (condition1)
            if (condition2) doSomething();
            else doAnything();

        // Если требуется другая логика, необходимо использовать составной оператор:
        if (condition1) {
            if (condition2) doSomething();
        } else doAnything();

        // либо
        if (condition1 && condition2) doSomething();
        else doAnything();
    }

    static void doSomething() {
    }

    static void doAnything() {
    }
}
