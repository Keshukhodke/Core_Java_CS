package Typecastg_22_08_25;

public class Demo1 {
    public static void main(String[] args) {
       // float f1 = 100.2;           // Valid. int literal 100 is automatically promoted to float.
       // System.out.println(f1);   // Prints: 100.0

        int f2 = (int) 110.5;           // **Compile-time error.** 100.5 is a double literal, cannot be assigned to int without casting.
        System.out.println(f2);
    }
}
//* typecasting is the two types
//1)implicitit typecasting :- Occurs when a smaller type is converted into a larger type automatically by the compiler.
//2)explicit typecasting  :-   Required when converting a larger type into a smaller type; you have to tell the compiler how to do it.
