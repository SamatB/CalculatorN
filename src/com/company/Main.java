package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Operation symbols \"+\", \"-\", \"*\", \"/\".");
        do {
            try {
                Scanner scanner;
                System.out.println("Enter arab or rome numbers by a space: ");
                scanner = new Scanner(System.in);
                String num = scanner.nextLine();
                String[] array = num.split(" ");
                String num1 = array[0];
                String symbol = array[1];
                String num2 = array[2];

                try {
                    if (RomanNumbers.adds(num1) && RomanNumbers.adds(num2)) {
                        RomeCalculating.calculate(num1, num2, symbol);
                    } else {
                        ArabicNumbers.arabCalculating(num1, num2, symbol);
                    }
                } catch (Exception e) {
                    System.out.println("Operate arabic to arabic or roman to roman!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter numbers in one line by a space!");
            }
        } while (true);
    }
}

