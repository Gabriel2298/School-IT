package Sesiunea9.College_Management;

import java.util.ArrayList;
import java.util.List;

public class Professors extends Person {
    private String professorID;
    private List<Course>courses;

    public Professors(String firstName, String lastName, String sex, int age, String dateOfBirth, String CNP, String address) {
        super(firstName, lastName, sex, age, dateOfBirth, CNP, address);
        this.professorID = professorID;
        this.courses = new ArrayList<>();
    }
    public void addCourses(Course course){
        courses.add(course);
    }
    public List<Course>getCourses(){
        return courses;
    }
}
