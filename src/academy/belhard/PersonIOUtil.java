package academy.belhard;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

        public static void readPersons(String filename) throws Exception {

        String fileName = "Heroes";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            list = br.lines().collect(Collectors.toList());
            if (list.isEmpty() == true) {
                EmptySourceFileException y = new EmptySourceFileException();
                System.out.println(y);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        list.forEach(System.out::println);

    }
}
//    public Person readFromFile(String filename) throws Exception {
//        String fileName = "Heroes";
//        List<Person> persons = new ArrayList<>();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            reader.readLine();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        persons.forEach(System.out::println);
//
//
//        String[] stringArr = persons.toArray(new String[]);
//        String firstName = stringArr[0];
//        String lastName = stringArr[1];
//        String city = stringArr[2];
//        String street = stringArr[3];
//        int houseNumber = Integer.parseInt(stringArr[4]);
//
//        return new Person (firstName, lastName, city, street, houseNumber);
//    }
//}










