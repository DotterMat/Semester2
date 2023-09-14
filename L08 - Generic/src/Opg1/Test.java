package Opg1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Person<String> person1 = new Person<>("Peter");
        System.out.println(person1);

        Person<String> person2 = new Person<>("Nivmar");
        int comparison1 = person1.compareTo(person2);
        System.out.println(person1 + " compared to " + person2 + ": " + comparison1);

        FullName fullName1 = new FullName("Sandra","Lincoln");
        FullName fullName2 = new FullName("Jens","Egenlund");
        FullName fullName3 = new FullName("Erik","Askelund");
        Person<FullName> person3 = new Person<>(fullName1);
        Person<FullName> person4 = new Person<>(fullName2);
        Person<FullName> person5 = new Person<>(fullName3);

        int comparison2 = person3.compareTo(person4);
        System.out.println(person3 + " compared to " + person4 + ": " + comparison2);


        ArrayList<Person<FullName>> persons = new ArrayList<>();
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }
}
