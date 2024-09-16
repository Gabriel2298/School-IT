package Sesiunea9.College_Management;

public class Course {
    private String courseName;
    private String schedule;
    private String description;
    private int duration;
    private Professors assignedProfessors;

    public Course(String courseName, String schedule, String description, int duration) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.description = description;
        this.duration = duration;
    }

    public void setAssignedProfessors(Professors professors) {
        this.assignedProfessors = professors;
        professors.addCourses(this);
    }


    public String getCourseName() {
        return courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public Professors getAssignedProfessors() {
        return assignedProfessors;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", schedule " + schedule + ", duration " + duration + " minutes," + description + "." + "\nProfessor: " + (assignedProfessors != null ? assignedProfessors.toString() : "None");
    }
}
