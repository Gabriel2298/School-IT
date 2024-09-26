package Sesiunea9.College_Management;

public class Students extends Person {
    public Students(String firstName, String lastName, String sex, int age, String dateOfBirth, String CNP, String address) {
        super(firstName, lastName, sex, age, dateOfBirth, CNP, address);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }
}
