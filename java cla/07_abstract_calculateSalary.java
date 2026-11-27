abstract class Employee {
    String name;
    int id;
    double basicSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employee {

    Manager(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.30);
    }
}

class Programmer extends Employee {

    Programmer(String name, int id, double basicSalary) {
        super(name, id, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee m = new Manager("Vivek", 101, 50000);
        Employee p = new Programmer("Rahul", 102, 40000);

        System.out.println("--- Manager Details ---");
        m.displayDetails();

        System.out.println("\n--- Programmer Details ---");
        p.displayDetails();
    }
}