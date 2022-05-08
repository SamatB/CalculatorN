package com.company;

public class RomeCalculating extends RomanNumbers implements  Calculate{

    public RomeCalculating() {
    }


    static void calculate(String number1, String number2, String symbol) {
        int numb1, numb2, result;
        try {
            numb1 = RomanNumbers.romeNumsinToNums(number1);
            numb2 = RomanNumbers.romeNumsinToNums(number2);

            result = Calculate.calculating(numb1, numb2, symbol);
            String res = RomanNumbers.RomeNums(result);
            String num1 = RomanNumbers.RomeNums(numb1);
            String num2 = RomanNumbers.RomeNums(numb2);


            System.out.println("Result of rome numbers: " + num1 +" " + symbol
                    + " " + num2 + " = " + res);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
