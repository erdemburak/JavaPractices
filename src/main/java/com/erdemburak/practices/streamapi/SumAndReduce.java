package com.erdemburak.practices.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(List.of(3,4,4,5,2,5,6,7,2,2));
        //List<Integer> num = Arrays.asList(2,4,34,5,23,2,5,6,3,34,2,23,5,6,33,12);

        System.out.println(calculate2(num));

    }

    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int calculate2(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }
}
