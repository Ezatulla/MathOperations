package com.example.mathoperations;

/**
 * Created by ezatullah on 28/08/2018.
 */

public class Operations {

    public static int addition(int a, int b)
    {
        return a+b;
    }
    public static int subtraction (int a, int b)
    {
        return a-b;
    }
    public static int Multiplication(int a, int b)
    {
        return a*b;
    }
    public static int Division(int a, int b) throws IllegalAccessException {
        if(b==0)
        {
            throw new IllegalAccessException ( "dividing by zero is equal to Infinit\n Means Error" );
        }
        else
            return a/b;
    }
}
