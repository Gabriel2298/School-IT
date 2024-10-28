package Sesiunea16;

import java.util.Objects;

//Create a Student class with name, age, studentId, and email fields.
// Implement the equals() method to check all fields except the studentId.
// Implement the hashCode() method to use all fields except the student Id to calculate the hash code.
// Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
public class StudentTest {
    public static void main(String... args) {
        Student student1 = new Student("Vali" , 29,12345,"werty@yahoo.com");
        Student student2 = new Student("Marcel" , 40,987654,"asdfghjkl@yahoo.com");
        Student student3 = new Student("Vali" , 29,12345,"werty@yahoo.com");

        System.out.println("We check if dates of stundet1 is equals with student2: " + student1.equals(student2));
        System.out.println("We check if dates of student1 is equals with student3: " + student1.equals(student3));

        System.out.println("We check if hashCode of student1 is equals with student2: " + (student1.hashCode()==student2.hashCode()));
        System.out.println("We check is hashCode of student1 is equals with student3: " +(student1.hashCode()==student3.hashCode()));
    }
}

class Student {
    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o1) {
        if (this == o1) {
            return true;
        }
        if (o1 == null || getClass() != o1.getClass()) {
            return false;
        }
        Student students = (Student) o1;
        return age == students.age && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
