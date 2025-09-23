package Method_04_09_25;

public class Method1 {
    public static void main(String[] args) {
        int length = 14;
        System.out.println("The length of the reactangle is " + length);
        int breadth = 10;
        System.out.println("The breadth of the reactangle is " + breadth);
         AreaRectangle(length, breadth);
    }

    static void AreaRectangle(int a , int b )
    {
        int result = a*b;
        System.out.println("the area of rectangle is "+ result);
    }

}
