class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

// Single Inheritance
class Student extends Department {
    String studentName;
    int rollNo;

    Student(String deptName, String studentName, int rollNo) {
        super(deptName);
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    void showStudent() {
        showDepartment();
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
    }
}

// Hierarchical Inheritance
class Faculty extends Department {
    String facultyName;
    String subject;

    Faculty(String deptName, String facultyName, String subject) {
        super(deptName);
        this.facultyName = facultyName;
        this.subject = subject;
    }

    void showFaculty() {
        showDepartment();
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Subject: " + subject);
    }
}

// Multilevel Inheritance
class ResearchStudent extends Student {
    String researchTopic;

    ResearchStudent(String deptName, String name, int rollNo, String topic) {
        super(deptName, name, rollNo);
        this.researchTopic = topic;
    }

    void showResearch() {
        showStudent();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Student Details ---");
        Student s = new Student("CSE", "Vivek", 101);
        s.showStudent();

        System.out.println("\n--- Faculty Details ---");
        Faculty f = new Faculty("CSE", "Rahul", "Java");
        f.showFaculty();

        System.out.println("\n--- Research Student Details ---");
        ResearchStudent r = new ResearchStudent(
            "CSE", "Amit", 102, "Artificial Intelligence"
        );
        r.showResearch();
    }
}