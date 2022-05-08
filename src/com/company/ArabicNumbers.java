package com.company;

public class ArabicNumbers implements Calculate {
    static void arabCalculating(String a, String b, String symbol) throws Exception {
        int num1, num2, result;
        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        result = Calculate.calculating(num1, num2, symbol);
        System.out.println("Result of arab numbers: " + num1 +
                " " + symbol + " " + num2 + " = " + result);
    }
}
