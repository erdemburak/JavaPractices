package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,5,3,2,3,33,5,4,3,2,1,67,8,7);

        //Virgülden sonra 3 basamak yazılmasını istediğimiz için string.format kullandık
        System.out.printf("%.3f%n", averageOfAllNumbers(nums));

    }

    public static double averageOfAllNumbers(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(num -> num)
                .average()
                .orElse(0);
    }
}
