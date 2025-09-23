package Method_04_09_25;

public class Area_of_Circle {
    public static void main(String[] args) {
        int r = 10;
        System.out.println("the radius of circle is ");
        final  float p = 3.14f;
        areaofcircle(r,p);


    }
    static  void areaofcircle(int r,float p)
    {
        System.out.println("area of cicle is "+(p*r*r));
    }
}
