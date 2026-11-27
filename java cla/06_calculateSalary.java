class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {

    Manager(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.30);
    }
}

class Programmer extends Employee {

    Programmer(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager("Vivek", 50000);
        Programmer p = new Programmer("Rahul", 40000);

        System.out.println("Manager Name: " + m.name);
        System.out.println("Manager Salary: " + m.calculateSalary());

        System.out.println("\nProgrammer Name: " + p.name);
        System.out.println("Programmer Salary: " + p.calculateSalary());
    }
}