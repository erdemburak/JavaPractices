package com.erdemburak.practices.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println(mapToUppercase2("A","b","c","A","b","c"));;
    }

    // For döngüsü ile yapılışı
    public static Collection<String> mapToUppercase(String... names){
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names){
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    // Stream api kullanarak yapılışı
    // Array elemanlarını almak için => stream()
    // buyuk harflere çevirmek için => map()
    // liste olarak geri dönmek için => collect(Collec
    public static Collection<String> mapToUppercase2(String... names){
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }

}
