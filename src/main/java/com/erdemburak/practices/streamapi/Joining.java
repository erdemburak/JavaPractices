package com.erdemburak.practices.streamapi;

import com.erdemburak.practices.streamapi.maxandcomparator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>();
        collection.add(sara);
        collection.add(viktor);
        collection.add(eva);

        System.out.println(namesToString3(collection));
    }

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    //Map ile çözümü
    public static String namesToString2(List<Person> people) {
        return "Names: " + people.stream()
                .map(Person::getName)
                .reduce((i,sum) -> i + ", " + sum)
                .orElse("") + ".";
    }

    //Collect joining ile çözümü
    public static String namesToString3(List<Person> people) {
        return "Names: " +
                people.stream()
                        .map(Person::getName)
                        .collect(Collectors.joining(", "))
                + ".";
    }
}
