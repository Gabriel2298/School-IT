package Sesiunea12;

public class PercentageMarks {
    public static void main(String... args) {
        StudentA studentA = new StudentA(68, 89, 100);
        StudentB studentB = new StudentB(80, 70, 78, 100);

        studentA.getPercentage();
        studentB.getPercentage();

        System.out.println("The precentage subjects of Student A: " + studentA.getPercentage() + "%");
        System.out.println("The precentage subjects of Student B: " + studentB.getPercentage() + "%");

    }
}

//     We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four
//  subjects (each out of 100) by student B.
//     Create an abstract class 'Marks' with an abstract method 'getPercentage'.
//     It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
//     The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
//     Create an object for each of the two classes and print the percentage of marks for both the students.
abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {
    private int subject1, subject2, subject3;

    StudentA(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;  // 0-100
        this.subject2 = subject2;  // 0-100
        this.subject3 = subject3;  // 0-100
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class StudentB extends Marks {
    private int subject1, subject2, subject3, subject4;

    StudentB(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;   // 0-100
        this.subject2 = subject2;   // 0-100
        this.subject3 = subject3;   // 0-100
        this.subject4 = subject4;   // 0-100
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}