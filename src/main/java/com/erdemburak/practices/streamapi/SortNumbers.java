package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,2,55,234,4,3,5,3,33,21,412,53,2,3);

        System.out.println("Asc: " + sortNumbersAsc(nums));
        System.out.println("Dsc: " + sortNumbersDsc(nums));
    }
    private static List<Integer> sortNumbersAsc(List<Integer> numbers){
        return numbers.stream().sorted().collect(Collectors.toList());
    }
    private static List<Integer> sortNumbersDsc(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
