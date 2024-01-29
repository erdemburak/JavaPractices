package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAverageOfNumbers {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,22,32,11,4,6,2,4);

        //Virgülden sonra 3 basamak yazılmasını istediğimiz için string.format kullandık
        System.out.printf("%.3f%n", averageOfSquareNumbers(nums));
    }
    private static double averageOfSquareNumbers(List<Integer> numbers){
        return numbers.stream()
                .map(num -> num*num)
                .filter(num -> num>100)
                .mapToInt(num -> num)
                .average()
                .orElse(0);
    }
}
