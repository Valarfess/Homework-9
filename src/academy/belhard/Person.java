package academy.belhard;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public Address address;

    public Person(String firstName, String lastName, Address address) throws NullFieldException {
        try {
            if (firstName == null || lastName == null || address == null) {
                throw new NullFieldException("Error! Поля должны быть заполнены");
            }
        } catch (NullFieldException e) {
            System.err.println(e.getMessage());
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n" + "Person:" +
                "FirstName-" + firstName + "," +
                "LastName-" + lastName +
                ",Location info:" + address.getCity() + "," + address.getStreet() + "," + address.getHouseNumber();
    }
}

