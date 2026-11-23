class Example2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Example2 <number1> <number2>");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a + b;
            System.out.println("Hello World " + c);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}
