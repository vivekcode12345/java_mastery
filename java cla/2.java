import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void viewMarks() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class Faculty {
    void enterMarks(Student s, int marks) {
        s.marks = marks;
        System.out.println("Marks entered successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("Vivek", 101);
        Faculty f = new Faculty();

        System.out.print("Faculty, enter student marks: ");
        int marks = sc.nextInt();

        f.enterMarks(s, marks);

        System.out.println("\n--- Student View ---");
        s.viewMarks();

        sc.close();
    }
}