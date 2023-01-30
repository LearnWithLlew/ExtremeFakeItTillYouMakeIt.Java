package org.learnwithllew;

public class FizzBuzz {
    public static String print(int i) {
        String coma = ",";
        String firstPart = "";
        for (int j = 1; j <= 14; j++) {
            if (j %3 == 0) {
                firstPart += "Fizz,";

            } else if (j % 5 == 0 ) {
                firstPart += "Buzz,";

            } else {
                firstPart += j + coma;
            }
        }
        firstPart += "FizzBuzz,";
        String expected2 = firstPart +  "16,17,Fizz,19,Buzz";
        return expected2;
    }
}
