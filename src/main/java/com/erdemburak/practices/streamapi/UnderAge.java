package com.erdemburak.practices.streamapi;

import com.erdemburak.practices.streamapi.maxandcomparator.Person;

import java.util.*;
import java.util.stream.Collectors;

public class UnderAge {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = new ArrayList<>();
        collection.add(sara);
        collection.add(viktor);
        collection.add(eva);
        collection.add(anna);

        System.out.println(getKidNames2(collection));

    }

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNames2(List<Person> people){
        return people.stream()
                .filter(person -> person.getAge()<18).map(Person::getName)
                .collect(Collectors.toSet());
    }

}
