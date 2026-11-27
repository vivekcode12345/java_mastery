import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            // Read file and display contents
            try {
                FileReader fr = new FileReader(args[0]);
                int ch;

                while ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                }

                fr.close();

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else if (args.length == 2 && args[0].equals(">")) {
            // Read console input and write into file
            try {
                Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter(args[1]);

                System.out.println("Enter text (type EXIT to stop):");

                while (true) {
                    String line = sc.nextLine();

                    if (line.equals("EXIT")) {
                        break;
                    }

                    fw.write(line + "\n");
                }

                fw.close();
                System.out.println("File saved successfully.");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else {
            System.out.println("Usage:");
            System.out.println("java Main filename");
            System.out.println("java Main '>' filename");
        }
    }
}