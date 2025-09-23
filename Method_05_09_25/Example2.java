package Method_05_09_25;

public class Example2 {
    // a method can be accept multiple arguments let cannot return multiple arguments
    // a method at any point of time can retuern only a single asrgument

    public static void main(String[] args) {
         float status = multi();
        System.out.println(status);



    }

    static  float multi()
    {
        int result1 = 10*20;
        float result2 = 1.5f * 2.5f ;
        return result1+ result2;
    }
}
