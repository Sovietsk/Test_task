
package com.company;


public class Calculating
{
    int otv (String [] part)
    {
        String one_element = part [0];
        String two_element = part [1];
        String three_element = part [2];
        int answer=1;
        int first_number = Condition.Statement(one_element);
        int second_number = Condition.Statement(three_element);


        if (two_element.equals("+")) {answer=first_number+second_number;}
            else if (two_element.equals ("*")) {answer=first_number*second_number;}
                else if (two_element.equals ("-")) {answer=first_number-second_number;}
                    else if (two_element.equals ("/")) {answer=first_number/second_number;}
        return answer;
    }

}