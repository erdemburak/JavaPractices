package com.erdemburak.practices.questions;

public class ReverseInteger {
    public static void main(String[] args) {
        long number = 54321;

        System.out.println(getReverseNumber(number));
    }

    private static long getReverseNumber(long number){
        long reverseNumber = 0;
        while (number!=0){
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number = number/10;
            if(reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE){
                return 0; // or throw an exception
            }
        }

        return reverseNumber;

    }
}
