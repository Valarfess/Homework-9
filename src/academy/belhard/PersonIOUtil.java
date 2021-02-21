package academy.belhard;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class PersonIOUtil {

    public static void writePersons(String filename, List<Person> persons) {

        try (FileWriter writer = new FileWriter(filename)) {
            for (Person person : persons) {
                writer.write(person.getFirstName() + " :: " +
                        person.getLastName() + " :: " +
                        person.address.getCity() + " :: " +
                        person.address.getStreet() + " :: #" +
                        person.address.getHouseNumber() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readPersons(String filename) throws EmptySourceFileException {

        String fileName = "Heroes.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            list = br.lines().collect(Collectors.toList());
            if (list.isEmpty() == true) {
                EmptySourceFileException y = new EmptySourceFileException("Error!");
                System.out.println(y);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

    }
}


//      public ArrayList<Person> persons;
//          Person[] parts = persons.toArray(new Person[0]);
//          Person firstName = parts[0];
//          Person lastName = parts[1];
//          Person city = parts[2];
//          Person street = parts[3];
//          int houseNumber = Integer.parseInt(String.valueOf(parts[4]));

    //          persons.add(parts[0], parts[1], parts[2], parts[3], parts[4])
//          return new Person(String firstName, String lastName, Address address);
//      }
//    public List<Person> readPersons() throws IOException {
//        List<Person> persons = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            reader.readLine(); // пропускаем строку с заголовками
//
//            String csvString;
//
//            while ((csvString = reader.readLine()) != null) {
//                Person person = TxtUtil.toObject(txtString);
//
//                persons.add(person);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return persons;
//    }
//
//}











