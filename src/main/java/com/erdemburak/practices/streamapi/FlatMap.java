package com.erdemburak.practices.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<String>> stringList = new ArrayList<>();

        // İlk satırı ekleme
        stringList.add(new ArrayList<>());
        stringList.get(0).add("Armagan");
        stringList.get(0).add("Burak");
        stringList.get(0).add("Armi");

        // İkinci satırı ekleme
        stringList.add(new ArrayList<>());
        stringList.get(1).add("Erdem");
        stringList.get(1).add("Armovski");
        stringList.get(1).add("Armi");


        System.out.println(transform2(stringList));

    }

    //Aşağıdaki fonksiyon multidimention bi List alıp onu tek boyutlu bir listeye çeviriyor (for döngüsü ile)
    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        for(List<String> subCollection: collection){
            for(String value: subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }


    // Nested List'e ait değerleri al => stream()
    // her bir elemanı bir listeye ekle => flatMap()
    // FlatMap(Collection::stream) fonksiyonu ile verdiğimiz multidimention list'i tek bir list haline dönüştürdük.
    public static List<String> transform2(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)//Stream<Stream<String>> -> Stream<String>
                .collect(Collectors.toList()); // Stream<String> -> List<String>
    }

}
