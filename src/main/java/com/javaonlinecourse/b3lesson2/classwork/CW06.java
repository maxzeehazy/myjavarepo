package com.javaonlinecourse.b3lesson2.classwork;

/**
 * Author: E_Mitrohin
 * Date:   24.11.2016.
 *
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.25
 */
public class CW06 {
    public static void main(String[] args) {
        boolean flag = false;
        Number n = flag ? new Integer(1) : new Double(2.0);

        System.out.println( n instanceof Integer ? "Я Integer " + n : "Я Double " + n);

       /* Number n;
        if( flag )
            n = Double.valueOf((double) ( new Integer(1).intValue() ));
        else
            n = Double.valueOf(new Double(2.0).doubleValue()); */

        Integer i = false ? 1 : (false ? 2 : null);

        System.out.println();

        /*Integer i;
        if( false )
            n = Integer.valueOf(1);
        else {
            if( false )
                n = Integer.valueOf(Integer.valueOf(2).intValue());
            else
                n = Integer.valueOf(((Integer)null).intValue());
        }*/
    }
}
