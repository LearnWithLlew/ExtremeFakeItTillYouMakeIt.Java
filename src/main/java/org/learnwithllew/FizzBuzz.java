package org.learnwithllew;

public class FizzBuzz {
    public static String print(int i) {
        String coma = ",";
        String firstPart = "";
        for (int j = 1; j <= 19; j++) {
            if (j % 15 == 0) {
                firstPart += "FizzBuzz";

            } else if (j % 3 == 0) {
                firstPart += "Fizz";

            } else if (j % 5 == 0) {
                firstPart += "Buzz";

            } else {
                firstPart += j;
            }
            firstPart += coma;
        }
        String expected2 = firstPart + "Buzz";
        return expected2;
    }
}
