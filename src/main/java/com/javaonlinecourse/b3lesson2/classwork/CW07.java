package com.javaonlinecourse.b3lesson2.classwork;

import java.util.Arrays;

/**
 * Author: E_Mitrohin
 * Date:   24.11.2016.
 */
public class CW07 {
    public static void main(String[] args) {
        Double[] array = new Double[]{ 1D, 5D, 2D, 3D,};

        Double[] newArray = array.clone();
        Double[] newArray2 = new Double[array.length];

        System.arraycopy(array, 0, newArray, 0, array.length);

        Double[] newArray3 = Arrays.copyOf(array, array.length);

    }
}
