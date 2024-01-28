package com.erdemburak.practices.streamapi;

import com.erdemburak.practices.streamapi.maxandcomparator.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>();
        collection.add(sara);
        collection.add(viktor);
        collection.add(eva);

        System.out.println(partitionAdults2(collection));
    }
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }
    public static Map<Boolean, List<Person>> partitionAdults2(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge()>=18, Collectors.toList()));

    }
}