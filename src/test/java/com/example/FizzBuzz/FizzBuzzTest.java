package com.example.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    /* Entrée 3 =>
    "1
    2
    Fizz" */
    @Test
    public void test_Return_One_As_String_When_Input_Is_One_As_Integer() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.run(1);
        assertEquals("1", result);
    }

    @Test
    public void test_Return_Fizz_When_Input_Is_Three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.run(3);
        assertEquals("12Fizz", result);
    }

    @Test
    public void test_Return_Buzz_When_Input_Is_Five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.run(5);
        assertEquals("12Fizz4Buzz", result);
    }
}
