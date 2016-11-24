package com.javaonlinecourse.b3lesson2.homework;

/**
 * Author: E_Mitrohin
 * Date:   24.11.2016.
 *
 * Написать функцию, которая проверяет,
 * является ли заданная квадратная матрица
 * симметричной относительно главной
 * диагонали.
 *
 */
public class HW02 {

    public static void main(String[] args) {

        System.out.println(checkMatrix(new int[][]{
                {1,  2,  8,  11},
                {2,  3,  24, 5},
                {8,  24, 6,  4},
                {11, 5,  4,  9},
        })); //true

        System.out.println(checkMatrix(new int[][]{
                {2,  3,  24, 5},
                {2,  3,  24, 5},
                {11, 5,  4,  9},
                {11, 5,  4,  9},
        })); //false

    }

    public static boolean checkMatrix(int[][] matrix)
    {
        return false;
    }

}
