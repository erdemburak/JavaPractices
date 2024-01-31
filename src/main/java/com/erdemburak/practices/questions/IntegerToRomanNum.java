package com.erdemburak.practices.questions;

public class IntegerToRomanNum {
    public static void main(String[] args) {

        int intNumber = 2344;

        System.out.println(intToRomanNumber(intNumber));
    }

    private static String intToRomanNumber(int number){
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundereds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands = new String[]{"","M","MM","MMM"};

        return thousands[number / 1000]+
                hundereds[(number % 1000) / 100]+
                tens[(number % 100) / 10]+
                units[number % 10];
    }
}
