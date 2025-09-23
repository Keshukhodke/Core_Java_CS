package Method_04_09_25;
// calculate the area of triangle
public class Area_of_Triangle {

    public static void main(String[] args) {
        int breadth  = 10;
        System.out.println("the breadth  of traingle is "+ breadth);
        int height = 20;
        System.out.println("the height of triangle is "+ height);
        test(height, breadth);

        //System.out.println("the area");

        ;
    }
    static void test(int x, int y )
    {
        System.out.println("area of triangle  is "+(0.5*x*y));
    }
}
