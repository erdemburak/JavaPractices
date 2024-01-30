package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,2,55,234,4,3,5,3,33,21,412,53,2,3);

        System.out.println(limitToFirst5(nums));
        System.out.println(skipFirst5(nums));
    }

    // ilk 5 değeri almak için -> limit(5)
    // stream'i Int e çevir -> .mapToInt(num -> num)
    // listedeki değerleri topla -> .sum()
    private static int limitToFirst5(List<Integer> numbers){
        return numbers.stream()
                .limit(5)
                .mapToInt(num -> num)
                .sum();
    }
    private static List<Integer> skipFirst5(List<Integer> numbers){
        return numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
    }

}
