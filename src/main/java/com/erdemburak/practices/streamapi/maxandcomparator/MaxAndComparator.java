package com.erdemburak.practices.streamapi.maxandcomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>();
        collection.add(sara);
        collection.add(viktor);
        collection.add(eva);

        System.out.println(getOldestPerson2(collection).getName());
    }

    // Listedeki personlar arasındaki en yaşlısını for döngüsü ile getiriyoruz.
    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    // max() fonksiyonu ile listedeki age değeri en yüksek olan person verisini çekiyoruz.
    // orElse(null) ile listede veri olmamasına karşılık olarak null döndürüyoruz.
    public static Person getOldestPerson2(List<Person> people) {
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElse(null);
    }

}
