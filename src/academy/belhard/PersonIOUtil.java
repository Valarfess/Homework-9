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

    public static void writePersons(String fileName, List<Person> persons) {

        try (FileWriter writer = new FileWriter(fileName)) {
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

    public static void readPersons(String fileName) throws EmptySourceFileException {
        fileName = "Heroes.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            list = br.lines().collect(Collectors.toList());
            if (list.isEmpty() == true) {
                throw new EmptySourceFileException("Error!");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        list.forEach(System.out::println);


    }
}

//    public static List<Person> readPersons (String fileName) throws EmptySourceFileException {
//        List<Person> persons = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
//            String s;
//            while ((s = reader.readLine() != null) {
//                String[] dataArray = s.split("::");
//                dataArray firstName = dataArray[0];
//                dataArray lastName = dataArray[1];
//                dataArray city = dataArray[2];
//                dataArray street = dataArray[3];
//                int houseNumber = Integer.parseInt(String.valueOf(dataArray[4]));
//                Person person = new Person(firstName,lastName, new Address(city,street,houseNumber));
//                persons.add(person);
//            }
//            if (persons.isEmpty() == true) {
//                throw new EmptySourceFileException("Error!");
//            }
//        } catch (FileNotFoundException e) {
//            throw new EmptySourceFileException("Такого файла не существует...");
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//        return persons;
//    }
//}













