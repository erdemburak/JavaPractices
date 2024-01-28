package com.erdemburak.practices.streamapi;

import java.util.ArrayList;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(List.of(3,4,4,5,2,5,6,7,2,2));

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
