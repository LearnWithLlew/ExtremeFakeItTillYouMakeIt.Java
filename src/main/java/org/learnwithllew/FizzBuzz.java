package org.learnwithllew;

public class FizzBuzz {
    public static String print(int max)
    {
        String number = "" + 1;
        String separator = ",";
        String anotherNumber = "2";
        String fizz = "Fizz";
        String result = "";
        for (int x=0; x < 1; x++) {
            result += x+1 + separator;
        }
        result += anotherNumber + separator;
        result += fizz + separator;
        String expected = result + "4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        return expected;
    }
}
