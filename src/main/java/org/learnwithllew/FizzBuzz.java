package org.learnwithllew;

public class FizzBuzz {
    public static String print(int max) {
        String separator = ",";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String result = "";
        for (int x = 1; x <= max; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                result += fizz + buzz;
            } else if (x % 3 == 0) {
                result += fizz;
            } else if (x % 5 == 0) {
                result += buzz;
            } else {
                result += x;
            }
            if (x != max) {
                result += separator;
            }
        }
        return result;
    }
}
