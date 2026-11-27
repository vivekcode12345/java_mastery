import java.util.Scanner;

class MyString {
    String str;

    MyString(String str) {
        this.str = str;
    }

    int length() {
        return str.length();
    }

    String reverse() {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    String toUpperCase() {
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            upper = upper + ch;
        }

        return upper;
    }

    String toLowerCase() {
        String lower = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            lower = lower + ch;
        }

        return lower;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        MyString s = new MyString(input);

        System.out.println("Length: " + s.length());
        System.out.println("Reverse: " + s.reverse());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        sc.close();
    }
}