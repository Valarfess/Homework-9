package academy.belhard;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public Address address;

    public Person (String firstName, String lastName, Address address) throws NullFieldException {
        try {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

            if (firstName == null || lastName == null || address == null)
            { NullFieldException x = new NullFieldException("Ошибка!");
                System.out.println(x);
            }
            else;
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            return  "\n" + "Person: " +
                    "FirstName - " + firstName + ", " +
                    "LastName - " + lastName  +
                    ", Location info: " + address.getCity() + ", ul." + address.getStreet() + ", #" + address.getHouseNumber() +
                    '.';
    }
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Person)) return false;
//            Person person = (Person) o;
//            return  firstName.equals(person.firstName) &&
//                    lastName.equals(person.lastName) &&
//                    address.equals(person.address);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(firstName, lastName, address);
//        }
}
