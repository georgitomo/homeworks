package Homework5;

public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        showPersonInfo();
        System.out.println("Score: " + score);
    }
}
