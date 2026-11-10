public class Display {
    public static void main(String[] args) {
        System.out.println("hello"+(10+20)); //hello30
        System.out.println("hello"+10+20); //hello1020
        System.out.println(10+20+"hello"); //30hello
        System.out.println(10+20+"hello"+10+20); //30hello1020 
    }
    
}
