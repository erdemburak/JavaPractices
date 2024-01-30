package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopTwoHighestFrequency {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,2,5,43,7,8,79,5,5,6,3,2,23,5,456,54);

        Map<Integer,Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        frequencyMap.entrySet().stream()
                .sorted((entry1,entry2) -> Long.compare(entry2.getValue(),entry1.getValue()))
                .limit(2)
                .forEach(entry -> System.out.println(entry.getKey() +" sayısı " + entry.getValue() + " kez tekrar etti." ));

    }
}
