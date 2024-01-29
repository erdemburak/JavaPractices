package com.erdemburak.practices.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,22,234,634,32,4,1,2,222,3,53,26);

        System.out.println(numbersStartsWith2(nums));
    }

    // Ilk değerleri okuyabilmek için string'e çevir -> .map(String::valueOf)
    // 2 ile başlayanları filtrele -> .filter(num -> num.startsWith("2"))
    // filtrelenmiş string listeyi Integer a çevir -> .map(Integer::valueOf)
    // Liste olarak dön -> .collect(Collectors.toList());
    private static List<Integer> numbersStartsWith2(List<Integer> numbers){

        return numbers.stream()
                .map(String::valueOf)
                .filter(num -> num.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
