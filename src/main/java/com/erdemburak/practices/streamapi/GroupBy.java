package com.erdemburak.practices.streamapi;

import com.erdemburak.practices.streamapi.maxandcomparator.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = new ArrayList<>();
        collection.add(sara);
        collection.add(viktor);
        collection.add(eva);

        Map<String, List<Person>> result = groupByNationality2(collection);
        System.out.println(result.get("Serbian"));
    }
    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }
    public static Map<String, List<Person>> groupByNationality2(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getNationality, Collectors.toList()));
    }
}
