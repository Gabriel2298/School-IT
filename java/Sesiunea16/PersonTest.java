package Sesiunea16;

import java.util.Objects;

//Create a Person class with name, age, and email fields.
// Implement the equals() method to check only the name and age fields.
// Implement the hashCode() method to use the name and age fields to calculate the hash code.
// Test that two instances with the same name and age return true for equals() and have the same hash code.
public class PersonTest {
    public static void main(String... args) {
        Person per1 = new Person("Gabi", 20, "abcd@yahoo.com");
        Person per2 = new Person("Maria", 24, "qwert@yahoo.com");
        Person per3 = new Person("Gabi", 20, "zxvcbn@yahoo.com");

        System.out.println("Test if per1 = per2 -> " + per1.equals(per2));
        System.out.println("Test if per1 == per3 -> " + per1.equals(per3));

        System.out.println("Test person hashCode -> " + (per1.hashCode()==per2.hashCode()));
        System.out.println("Test person hashCode -> " + (per1.hashCode()==per3.hashCode()));
    }
}

class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person persons = (Person) o;
        return age == persons.age && Objects.equals(age, persons.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
