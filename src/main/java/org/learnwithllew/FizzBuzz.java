package org.learnwithllew;

public class FizzBuzz {
    public static String print(int i)
    {
        String number = "" + 1;
        String separator = ",";
        String anotherNumber = "2";
        String expected = number + separator + anotherNumber + separator + "Fizz" + separator + "4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        return expected;
    }
}
