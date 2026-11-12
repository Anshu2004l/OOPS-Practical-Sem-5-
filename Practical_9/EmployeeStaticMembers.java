class Employee {

    private String name;
    private double salary;
    private static int employeeCount;

    Employee() {
        this("Not assigned", 0.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    static void displayEmployeeCount() {
        System.out.println("Employees created: " + employeeCount);
    }
}

public class EmployeeStaticMembers {

    public static void main(String[] args) {
        Employee first = new Employee();
        Employee second = new Employee("Asha", 42000);
        Employee third = new Employee("Dev", 48000);

        first.display();
        second.display();
        third.display();
        Employee.displayEmployeeCount();

        // this.name and this.salary refer to fields on the current object.
        // this(...) chains the no-argument constructor to the parameterized one.
        // The static count belongs to the class and is shared by all objects.
    }
}
