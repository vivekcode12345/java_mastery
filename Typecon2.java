 class Typecon2 {
    public static void main(String[] args){
        byte a=127,b=3;
        int c;
        c=a+b; // implicit conversion as byte < int
        System.out.println(c);
    }    
}
