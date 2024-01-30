package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,54,2,2,43,34,23,4,32,5,56,657,4,55,83,4,1);

        System.out.println("Second Highest Number: " + secondHighestNumber(nums));
        System.out.println("Second Lowest Number: " + secondLowestNumber(nums));
    }

    // Listeyi büyükten küçüğe sırala -> .sorted(Collections.reverseOrder())
    // ilk değeri atla ->  .skip(1)
    // ilk değeri bul -> .findFirst()
    private static int secondHighestNumber(List<Integer> numbers){
        //return numbers.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().orElse(0);
        return numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);
    }
    // Listeyi küçükten büyüğe sırala -> .sorted(Collections.reverseOrder())
    // ilk değeri atla ->  .skip(1)
    // ilk değeri bul -> .findFirst()
    private static int secondLowestNumber(List<Integer> numbers){
        //return numbers.stream().sorted().limit(2).skip(1).findFirst().orElse(0);
        return numbers.stream().sorted().skip(1).findFirst().orElse(0);
    }


}
