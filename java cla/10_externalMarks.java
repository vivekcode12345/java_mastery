import java.util.Scanner;

class MarksException extends Exception {
    MarksException(String message) {
        super(message);
    }
}

class Student {
    int internal, external;

    Student(int internal, int external) {
        this.internal = internal;
        this.external = external;
    }

    void checkMarks() throws MarksException {

        if (internal > 30) {
            throw new MarksException("Internal mark exceeded");
        }

        if (external > 70) {
            throw new MarksException("External mark exceeded");
        }

        System.out.println("Marks are valid.");
        System.out.println("Internal Marks: " + internal);
        System.out.println("External Marks: " + external);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Internal Marks: ");
        int internal = sc.nextInt();

        System.out.print("Enter External Marks: ");
        int external = sc.nextInt();

        Student s = new Student(internal, external);

        try {
            s.checkMarks();
        } catch (MarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}