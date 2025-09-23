package Non_Static_18_09_25;

class cyber {
    int a = 10;

    // static method
    static float m1() {
        System.out.println("inside m1 method ");
        cyber c = new cyber();   // create object to access non-static 'a'
        float result1 = c.a * 2; // example calculation (you can change)
        return result1;
    }

    // static nested class
    static class success {
        static float b = 20.5f;

        float m2() {
            System.out.println("inside m2 method ");
            cyber c = new cyber();   // create object of outer class
            float result2 = c.a + b; // add non-static 'a' with static 'b'
            return result2;
        }
    }
}

public class Example {
    public static void main(String[] args) {
        System.out.println("start");

        float res1 = cyber.m1();               // call static method m1
         cyber.success s = new cyber.success(); // create object of static nested class
        float res2 = s.m2();                   // call m2

        float totalres = res1 + res2;
        System.out.println("total result is " + totalres);

        System.out.println("stop");
    }
}
