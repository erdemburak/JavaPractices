package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,2,55,234,4,3,5,3,33,21,412,53,2,3);

        System.out.println("Max number: " + maxNumber(nums));
        System.out.println("Min number: " + minNumber(nums));
    }

    private static int maxNumber(List<Integer> numbers){
        return numbers.stream().max(Comparator.comparing(Integer::valueOf)).orElse(0);
    }
    private static int minNumber(List<Integer> numbers){
        return numbers.stream().min(Comparator.comparing(Integer::valueOf)).orElse(0);
    }
}
