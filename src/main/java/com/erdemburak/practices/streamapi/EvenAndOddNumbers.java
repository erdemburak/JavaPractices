package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,2,5,3,4,7,4,57,45,12,34,31,55);

        System.out.println("Even Numbers: " + getEvenNumbers(nums));
        System.out.println("Odd Numbers: " + getOddNumbers(nums));
    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(e -> e%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> getOddNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(e -> e%2!=0)
                .collect(Collectors.toList());
    }
}
