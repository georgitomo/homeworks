package Homework5;

public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0;
        }
        double hourlyRate = daySalary / 8;
        return hourlyRate * 1.5 * hours;
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Day Salary: " + daySalary);
    }
}
