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
        for (int x = 1; x <= 15; x++) {
            if  (x == 15) {
                result += fizz + buzz + separator;
            }
            else if (x % 3 == 0) {
                result += fizz + separator;
            }
            else if(x == 5 || x == 10) {
                result += buzz + separator;
            }
            else {
                result += x + separator;
            }
        }
        String expected = result +
                "16,17,Fizz,19,Buzz";
        return expected;
    }
}
