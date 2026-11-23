 class Typcon {
    public static void main(String[] args){
        // int x;
        // x=(int)8.6; // explicit conversion as double > int
        // System.out.println(x);
        long x=10;
        int y;
        y=(int)x; // without (int) lossy conversion but explicit
        System.out.println(y);
    }
    
}
