class Calculator {

    int add(int first, int second) {
        return first + second;
    }

    int add(int first, int second, int third) {
        return first + second + third;
    }

    double add(double first, double second) {
        return first + second;
    }
}

class PayCalculator {

    double calculatePay() {
        return 0.0;
    }
}

class SalariedEmployee extends PayCalculator {

    private final double monthlySalary;

    SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class HourlyEmployee extends PayCalculator {

    private final double hourlyRate;
    private final int hoursWorked;

    HourlyEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class MethodOverloadingAndOverriding {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("add(10, 20): " + calculator.add(10, 20));
        System.out.println("add(10, 20, 30): " + calculator.add(10, 20, 30));
        System.out.println("add(2.5, 3.5): " + calculator.add(2.5, 3.5));

        PayCalculator[] employees = {
            new SalariedEmployee(50000),
            new HourlyEmployee(500, 80)
        };
        for (PayCalculator employee : employees) {
            System.out.println("Calculated pay: " + employee.calculatePay());
        }

        // Overloading is compile-time polymorphism: the compiler selects a
        // method from its parameter list. Overriding is runtime polymorphism:
        // the object's actual type selects calculatePay().
    }
}
