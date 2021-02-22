package academy.belhard;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Address address1 = new Address("Minsk", "Matusevicha", 54);
        Address address2 = new Address("Minsk", "Odoevskogo", 83);
        Address address3 = new Address("Minsk", "Fedorova", 13);

        Person person1 = new Person("Guns", "Anderson", address1);
        Person person2 = new Person("Sherlok", "Holmes", address2);
        Person person3 = new Person("Harry", "Potter", address3);

        System.out.println(person1 + " " + person2 + " " + person3);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        PersonIOUtil p1 = new PersonIOUtil();
        p1.writePersons("Heroes.txt", persons);

        p1.readPersons("Heroes.txt");





    }

}
