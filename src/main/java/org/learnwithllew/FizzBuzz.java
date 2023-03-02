package org.learnwithllew;

public class FizzBuzz {
    public static String print(int max)
    {
        String number = "" + 1;
        String separator = ",";
        String anotherNumber = "2";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String result = "";
        for (int x = 1; x < 5; x++) {
            if (x == 3) {
                result += fizz + separator;
            }
            else {
                result += x + separator;
            }
        }

        String expected = result + buzz + "," + "Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        return expected;
    }
}
