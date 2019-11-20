package com.company;

public class FizzBuzz {
    public static String  fizzBuzz(int number) {
        boolean isFizz = number % 5 == 0;
        boolean isBuzz = number % 3 == 0;
        if(isFizz && isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        }
        return number + "";
    }
}
