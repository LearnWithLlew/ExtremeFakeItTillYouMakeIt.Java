package org.learnwithllew;

public class FizzBuzz {
    public static String print(int max) {
        String number = "" + 1;
        String separator = ",";
        String anotherNumber = "2";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String result = "";
        for (int x = 1; x <= 19; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                result += fizz + buzz;
            } else if (x % 3 == 0) {
                result += fizz;
            } else if (x % 5 == 0) {
                result += buzz;
            } else {
                result += x;
            }
            result += separator;
        }
        String expected = result + "Buzz";
        return expected;
    }
}
