package academy.belhard;
import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonIOUtil {

    public static void writePersons(String filename, List<Person> persons) {

        try (FileWriter writer = new FileWriter(filename)) {
            for (Person person : persons) {
                writer.write(person.getFirstName() + " " +
                        person.getLastName() + ", " +
                        person.address.getCity() + ", " +
                        person.address.getStreet() + ", " +
                        person.address.getHouseNumber() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readPersons(String filename) throws Exception {
        try (FileReader reader = new FileReader("Heroes")) {
            Scanner scan = new Scanner(reader);
            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println(i + " - " + scan.nextLine());
                i++;
            }
//           if ()
//               EmptySourceFileException y = new EmptySourceFileException(" ");
//               System.out.println(y);
//           }
//
//       } catch (Exception e) {
//           e.getMessage();
        }
    }

    public List<Person> readFromFile() throws Exception {

        List<Person> persons1 = new ArrayList<>();

        try (FileReader reader = new FileReader("Heroes")) {
            Scanner scan = new Scanner(reader);
            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println(i + " - " + scan.nextLine());
                i++;
                Person person = PersonTxt.toObject("Heroes");

                    persons1.add(person);
                }
            } catch(Exception e){
                e.printStackTrace();
            }

            return persons1;
        }


    }









