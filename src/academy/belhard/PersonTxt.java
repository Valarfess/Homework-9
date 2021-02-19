package academy.belhard;

public class PersonTxt {
    public final static String DELIMITER = "::";
    public static final String[] HEADERS = {"First name", "Last name", "Address"};

    public static String headers() {
        return String.join(DELIMITER, HEADERS) + "\n";
    }

    public static String toTxtString(Person person) {
        return person.getFirstName() + DELIMITER +
                person.getLastName() + DELIMITER +
                person.getAddress() + DELIMITER
                + "\n";
    }

    public static Person toObject(String txt)  {
        String[] dataArray = txt.split(DELIMITER);

        String firstName = dataArray[0];
        String lastName = dataArray[1];
        String city = dataArray[2];
        String street = dataArray[3];
        int houseNumber = Integer.parseInt(dataArray[4]);

        return new Person(firstName, lastName, city, street, houseNumber);

    }
}
