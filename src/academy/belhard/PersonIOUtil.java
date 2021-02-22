package academy.belhard;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PersonIOUtil {

    public static void writePersons(String fileName, List<Person> persons) {

        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : persons) {
                writer.write(person.getFirstName() + "  " +
                        person.getLastName() + "  " +
                        person.address.getCity() + "  " +
                        person.address.getStreet() + "  " +
                        person.address.getHouseNumber() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPersons(String fileName) throws EmptySourceFileException {
        List<Person> persons1 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                String[] dataArray = s.split(" ");
                String firstName = dataArray[0];
                String lastName = dataArray[1];
                String city = dataArray[2];
                String street = dataArray[3];
                int houseNumber = Integer.parseInt(dataArray[4]);
                Person person = new Person (firstName, lastName, new Address(city, street, houseNumber));
                persons1.add(person);

            }
                if (persons1.size() == 0) {
                    throw new EmptySourceFileException("Error! Файл пуст");
                }
            } catch(IOException | NullFieldException e){
            throw new EmptySourceFileException("Error!Файл отсутствует");
            }
        return persons1;
        }
    }













