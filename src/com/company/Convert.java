
package com.company;

public class Convert
{
    static String Transfer(int n)
    {
        String v;

        if (((((n % 1000) % 500) % 100) % 50) % 10 > 0)
        {
            v = Condition.Roma_symbols[((((n % 1000) % 500) % 100) % 50) % 10 - 1];
        }
        else {
            v = "";
        }
        return v;
    }
        public static String stringSms(String a, int b)
        {
            StringBuilder A = new StringBuilder();
            for (int i=0; i<b; i++)
            {
                    A.append(a);
            }
            return a;
        }

}
