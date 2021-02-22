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
        List<Person> persons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                String[] dataArray = s.split(" ");
                String firstName = dataArray[0];
                String lastName = dataArray[2];
                String city = dataArray[4];
                String street = dataArray[6];
                int houseNumber = Integer.parseInt(dataArray[8]);
                Person person = new Person (firstName, lastName, new Address(city, street, houseNumber));
                persons.add(person);

            }
                if (persons.isEmpty() == true) {
                    throw new EmptySourceFileException("Error!");
                }
            } catch (FileNotFoundException e){
                throw new EmptySourceFileException("Такого файла не существует...");
            } catch(IOException e){
                e.getMessage();
            } catch (NullFieldException e) {
            e.printStackTrace();
        }
        return persons;
        }
    }













