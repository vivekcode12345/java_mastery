class StringExample1 {
    public static void main(String[] args) {
        String city1=new String("Bhopal");
        String city2=new String("Bhopal");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city1==city2);

        // Get first character of city1
        char ch1 = city1.charAt(0);
        System.out.println(ch1);
    }
}
