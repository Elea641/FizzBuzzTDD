package com.example.FizzBuzz;

public class FizzBuzz {

    public String run(int maximalNumber) {
        String result = "";

        for(int i = 1; i <= maximalNumber; i++) {
            if(i % 3 ==0) {
                result += "Fizz";
            }

            if(i % 5 ==0) {
                result += "Buzz";
            }

            if(i % 3 !=0 && i % 5 !=0) {
                result += String.valueOf(i);
            }
        }

        return result;
    }
}
