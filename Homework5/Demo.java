package Homework5;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("Ivana", 23, false);
        people[1] = new Person("Martin", 34, true);
        people[2] = new Person("Viktor", 20, true);
        people[3] = new Student("Boris", 20, true, 5.5);
        people[4] = new Student("Diana", 19, false, 4.2);
        people[5] = new Student("Elisaveta", 39, false, 4.2);
        people[6] = new Employee("Stefan", 37, true, 100);
        people[7] = new Employee("Lili", 17, false, 80);
        people[8] = new Employee("Monika", 16, false, 70);
        people[9] = new Employee("Maria", 20, false, 90);

        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else if (person != null) {
                person.showPersonInfo();
            }
            System.out.println();
        }

        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                double overtimePay = employee.calculateOvertime(2);
                System.out.println(employee.name + " has to take " + overtimePay + " due to 2h of overtime.");
            }
        }
    }
}

