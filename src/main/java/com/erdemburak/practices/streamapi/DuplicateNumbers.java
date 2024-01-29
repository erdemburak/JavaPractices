package com.erdemburak.practices.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,2,1,5,32,65,32,5,2,2,15,5,15);

        System.out.println(getDuplicateNumbersHashSet(nums));
    }

    // List içerisindeki verilerin tekrar sayılarını kontrol ediyoruz -> Collections.frequency(numbers, num)>1
    // tekrar eden veri istemediğimizden set tipine dönüştürüyoruz.
    private static Set<Integer> getDuplicateNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(num -> Collections.frequency(numbers, num)>1)
                .collect(Collectors.toSet());
    }

    // Hashset tekrarlanan verileri kabul etmediği için add metodunu false döndüren değerleri filtreliyoruz
    // gelen verileri set içerisine attığımızdan elimizdeki veriler tekrar etmiyor.
    private static Set<Integer> getDuplicateNumbersHashSet(List<Integer> numbers){
        Set<Integer> dubNum = new HashSet<>();
        return numbers.stream()
                .filter(num -> !dubNum.add(num))
                .collect(Collectors.toSet());
    }
}
