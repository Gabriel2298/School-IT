package Sesiunea9.College_Management;

/*
1. College Management System -  Design a system for a college to efficiently manage information about students, professors, and courses:
Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.
Similarly, maintain detailed profiles for every professor, including their first name, last name, sex, age, date of birth, CNP, and address.
The college offers eight distinct courses: Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History.
For each course, track details like its schedule, duration, description, and the assigned professor.
Allow for the assignment of a professor to a specific course and ensure the ability to retrieve and view course details, including its assigned professor.
*/


public class College_Managemnet {
    public static void main(String... args) {

        Professors professors = new Professors("Ion","Paraschiv" ,"Masculin", 32,"22/11/1992","19211222734251","Cluj ");
        Course course = (new Course("Mathematics","Mon-Tues-Fri 10:00","This is a mathematics primary course",60));

        course.setAssignedProfessors(professors);
        System.out.println(course);
    }
}
