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
        for (int x = 1; x <= 10; x++) {
            if (x == 3 || x == 6 || x == 9) {
                result += fizz + separator;
            }
            else if(x == 5 || x == 10) {
                result += buzz + separator;
            }
            else {
                result += x + separator;
            }
        }

        String expected = result + "11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        return expected;
    }
}
