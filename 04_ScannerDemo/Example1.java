import java.util.Scanner;
class Example1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first numbers");
        a=kb.nextInt();
        System.out.println("Enter second numbers");
        b=kb.nextInt();
        int c=a+b;
        System.out.println("Sum of two numbers is "+c);
        kb.close();
    }
}
