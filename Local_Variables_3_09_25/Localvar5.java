package Local_Variables_3_09_25;

public class Localvar5
{
    static float x= 10.2f;

}

class success
{
    static float result;

    public static void main(String[] args) {
        System.out.println("start");
        int z = 300;
        result= Localvar5.x + z;
        System.out.println("the result is "+ result);

        System.out.println("stop");
    }
}