import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name) {
        this.name = name;
    }

    void updateMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid marks! Marks must be between 0 and 100.");
        }

        this.marks = marks;
        System.out.println("Marks updated successfully!");
    }

    void displayMarks() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Faculty {
    void enterMarks(Student s, int marks) {
        try {
            s.updateMarks(marks);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("Vivek");
        Faculty f = new Faculty();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        f.enterMarks(s, marks);

        System.out.println("\n--- Student Details ---");
        s.displayMarks();

        sc.close();
    }
}