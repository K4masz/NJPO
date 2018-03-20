package AddressBook;

public class Person {
    private String surname;
    private String firstName;
    private long phoneNumber;


    public Person(String surname, String firstName, long phoneNumber) {
        this.surname = surname;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}