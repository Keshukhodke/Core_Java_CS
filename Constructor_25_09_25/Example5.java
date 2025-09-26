package Constructor_25_09_25;

// is it possible to call the constructor in another class
import Variable_20_08_25.Demo1;

class simple {
    simple() {
        System.out.println("inside a simple");
    }
}
  class   Demo {
          Demo()
      {
          System.out.println("inside Demo");
      }
  }

public class Example5 {
    public static void main(String[] args) {
        System.out.println("start");

        simple s1= new simple();
        Demo D = new Demo();

        System.out.println("stop");
    }

}
