
package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner String = new Scanner (System.in);
        String str;
        str = String.nextLine();
        String[] a = str.split (" ");



        if (a.length !=3) {System.out.println ("Неверная длина операции. Введите выражение из двух чисел и одной операции");}
            if (!a[1].equals("-") && !a[1].equals("+") && !a[1].equals("/") && !a[1].equals("*"))
            { System.out.println("Неверная операция. Выберите операцию из: сложения, умножения, вычитания или деления");}
                if (Condition.Detection_type_r(a[0]).equals("") && Condition.Detection_type_r(a[2]).equals(""))
                {
                    System.out.println ("Введён неверный формат");
                }
                    if (!Condition.Detection_type_r(a[0]).equals(Condition.Detection_type_r(a[2])))
                    {
                        System.out.println ("Введён неверный формат. Введите либо арабские, либо римские числа");
                    }


        Calculating Answer = new Calculating();
        if (Condition.Detection_type_r(a[0]).equals("Arab") && Condition.Detection_type_r(a[2]).equals("Arab"))
        {
            System.out.println(Answer.otv(a));
        }
            if (Condition.Detection_type_r(a[0]).equals("Roma") && Condition.Detection_type_r(a[2]).equals("Roma") && Answer.otv(a)<=0 )
            {
                System.out.println("Введите для положительное число не равное нулю");
            }
        else if (Condition.Detection_type_r(a[0]).equals("Roma") && Condition.Detection_type_r(a[2]).equals("Roma"))
            {
                System.out.println(Convert.Transfer(Answer.otv(a)));
            }
    }
}