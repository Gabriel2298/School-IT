package Sesiunea9.College_Management;

public class Person {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String CNP;
    private String address;

    public Person(String firstName, String lastName, String sex, int age, String dateOfBirth, String CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName + " " + age + "age, " + dateOfBirth + "date of birth, " + CNP + " CNP, " + address +"address.";
    }
}
