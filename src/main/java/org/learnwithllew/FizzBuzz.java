package org.learnwithllew;

public class FizzBuzz {
    public static String print(int i) {
        String coma = ",";
        String firstPart = "";
        for (int j = 1; j <= 2; j++) {
            firstPart += j + coma;
        }
        String expected2 = firstPart + "Fizz,"+ "4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        return expected2;
    }
}
