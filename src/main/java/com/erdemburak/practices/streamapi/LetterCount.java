package com.erdemburak.practices.streamapi;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("armagan","burak","armovski","erdem"));
    }

    // Array elemanlarını almak için => stream()
    // 5ten uzun isimleri filtrelemek için => filter()
    // Geriye kalan listedeki tüm harflerin sayısını getir => maptoInt()
    // harf sayılarını topla => sum()
    private static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

        return Arrays.stream(names)
                .filter(name -> name.length()>5) // Stream<String>
                .mapToInt(String::length) // Stream<Integer>
                .sum();

    }
}
