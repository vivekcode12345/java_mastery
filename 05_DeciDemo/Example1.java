import java.util.Scanner;

class Example1 {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a=kb.nextInt();
        if(a>0){
            System.out.println("The number is positive.");
        } else if(a<0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("Hello, World!");
        kb.close();
    }
}