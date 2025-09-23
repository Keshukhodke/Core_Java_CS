package Memory_08_09_25;


//Basic Call
//
//Write a program where class Car has two non-static methods:
//
//startEngine() → prints "Engine Started".
//
//stopEngine() → prints "Engine Stopped".
//
//Create an object of Car in main() and call both methods.

class  car
{
    void StartEngine()
    {
        System.out.println("Engine started");
    }

    void StopEngine() {
        System.out.println("Engine stoped");
    }

}
public class Example1 {
    public static void main(String[] args) {

        car c = new car();
        c.StartEngine();
        c.StopEngine();
    }


}
