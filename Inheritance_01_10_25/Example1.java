package Inheritance_01_10_25;

// Parent class
class parent {
    int a = 10;   // Instance variable of parent class
}

// Child class inheriting parent
class child extends parent {
    float b = 20.5f;  // Instance variable of child class
}

// Main class
public class Example1 {
    public static void main(String[] args) {

        // Creating object of parent class
        parent p = new parent();
        System.out.println(p.a);   // Accessing parent class variable 'a'

        // Creating object of child class
        child c = new child();
        System.out.println(c.b);   // Accessing child class variable 'b'
        System.out.println(c.a);   // Accessing parent class variable 'a' using child object (inherited)
    }
}
