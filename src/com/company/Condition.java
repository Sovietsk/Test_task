
package com.company;


public class Condition
{
    static String [] Roma_symbols = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String [] Arab_symbols = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static String Detection_type_r (String number)
    {
        String TYPE=" ";
        int d=Roma_symbols.length;
        for ( int i=0; i<d; i++)
            {
                if (number.equals(Roma_symbols[i]))
                {
                    TYPE="Roma";
                }
                if (number.equals(Arab_symbols[i]))
                {
                    TYPE = "Arab";
                }
            }
        return TYPE;

    }
    public static int Statement (String par)
    {
        int dlina = Arab_symbols.length;
        int a=0;
        for (int i=0; i<dlina; i++)
        {
            if (par.equals(Roma_symbols[i]))
            {
                a=i+1;
            }
                if (par.equals(Arab_symbols[i]))
                {
                    a=1+i;
                }
        }
    return a;
    }
}