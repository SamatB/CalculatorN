package com.company;

import java.util.ArrayList;
import java.util.List;

public class RomanNumbers {
    static boolean adds(String numbersN) {
        List<String> roms = new ArrayList<>();
        roms.add("O");
        roms.add("I");
        roms.add("II");
        roms.add("III");
        roms.add("IV");
        roms.add("V");
        roms.add("VI");
        roms.add("VII");
        roms.add("VIII");
        roms.add("IX");
        roms.add("X");
        for (String r : roms) {
            if (numbersN.equals(r)) {
                return true;
            }
        }

        return false;
    }

    public static String RomeNums(int arabNums) {
        String[] romeNumbers = {"O", "I", "II",
                "III", "IV", "V", "VI", "VII", "VIII",
                "IX", "X",  "XI", "XII",
                "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
                "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        return romeNumbers[arabNums];
    }

    static int romeNumsinToNums(String romeNumbers) throws Exception {

        switch (romeNumbers) {
            case "O":
                return 0;
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        throw new Exception("---");
    }
}
