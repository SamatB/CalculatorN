package com.company;

public interface Calculate {
    static int calculating(int a, int b, String c) throws Exception {

        int result = 0;
        boolean config = (a >= 0 & a <= 10) && (b >= 0 & b <= 10);
        if (config) {
            result = switch (c) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new RuntimeException("Invalid value, enter operator from  list");
            };
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Input numbers should be equal or less than 10");
        }
        return result;
    }
}
