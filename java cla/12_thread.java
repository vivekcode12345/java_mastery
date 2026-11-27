class Student extends Thread {

    public synchronized void run() {
        System.out.println("Student thread started.");
        System.out.println("Student is completing the assignment.");
        System.out.println("Student thread finished.\n");
    }
}

class Teacher extends Thread {

    public synchronized void run() {
        System.out.println("Teacher thread started.");
        System.out.println("Teacher is checking the first assignment.");
        System.out.println("Teacher is evaluating the assignment.");
        System.out.println("Teacher thread finished.\n");
    }
}

class Parents implements Runnable {

    public synchronized void run() {
        System.out.println("Parents thread started.");
        System.out.println("Parents are discussing student progress.");
        System.out.println("Parents thread finished.\n");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        Parents p = new Parents();
        Thread pt = new Thread(p);

        s.start();
        t.start();
        pt.start();
    }
}