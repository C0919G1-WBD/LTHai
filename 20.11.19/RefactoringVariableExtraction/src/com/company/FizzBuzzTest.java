package com.company;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testFizz3();
        test.testFizz6();
        test.testBuzz5();
        test.testBuzz10();
        test.testFizzBuzz15();
        test.testFizzBuzz30();
    }

    void testFizz3() {
        int number = 3;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }

    void testFizz6() {
        int number = 6;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }

    void testBuzz5() {
        int number = 5;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }

    void testBuzz10() {
        int number = 10;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }

    void testFizzBuzz15() {
        int number = 15;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }

    void testFizzBuzz30() {
        int number = 30;

        String result = FizzBuzz.fizzBuzz(number);
        System.out.println(result);
    }
}
