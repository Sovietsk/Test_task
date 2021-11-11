
package com.company;

public class Convert
{
    static String Transfer(int n)
    {
        int M = n / 1000;
        int D = (n % 1000) / 500;
        int C = ((n % 1000) % 500) / 100;
        int L = (((n % 1000) % 500) % 100) / 50;
        int X = ((((n % 1000) % 500) % 100) % 50) / 10;

        String v;
        String ans_roma;

        if (((((n % 1000) % 500) % 100) % 50) % 10 > 0)
        {
            v = Condition.Roma_symbols[((((n % 1000) % 500) % 100) % 50) % 10 - 1];
        }
        else
        {
            v = "";
        }
        ans_roma = stringSms("M", M) + stringSms("D", D) + stringSms("C", C) + stringSms("L", L) + stringSms("X", X) + v;

        return ans_roma;
    }
        public static String stringSms(String a, int b)
        {
            return String.valueOf(a).repeat(Math.max(0, b));
        }

}