package Method_05_09_25;


// if a method returns a data based on the type of the data return the return type should be of the same time
//if data int = return int
// if float = retun float
public class Example1 {

    public static void main(String[] args) {
        int num1=100;
        int num2 = 200;
        int result = add(num1, num2);
        System.out.println( " addition of num 1 and num2 is "+ result);
    }

    static int add(int num1, int num2)
    {
        int result = num1+num2;

        return result;
    }

}
