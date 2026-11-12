
class Person {

    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {

    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Manager m1 = new Manager();

        m1.displayPerson();
        m1.displayEmployee();
        m1.displayManager();
    }
}
