package academy.belhard;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Guns", "Anderson", new Address("Minsk", "Matusevicha", 54));
        Person person2 = new Person("Vasia", "Anderson", new Address("Grodno", "Lobanka", 13));
        Person person3 = new Person("Gena", "Anderson", new Address("Brest", "Sovetskaya", 40));

        System.out.println(person1 + " " + person2 + " " + person3);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        PersonIOUtil.writePersons("Heroes.txt", persons);
        System.out.println(PersonIOUtil.readPersons("Heroes.txt"));
    }
}
