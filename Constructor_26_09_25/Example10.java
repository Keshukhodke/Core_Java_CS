package Constructor_26_09_25;
class Employee
{
    int empid;
    String empname;
    Employee(int empid, String empname )
    {
        this.empid= empid;
        this.empname = empname;
    }
    void displayemployeeinfo()
    {
        System.out.println("Employee id is :-  "+empid+
        " employee name is :-  "+empname);
    }
}
public class Example10 {
    public static void main(String[] args) {
        System.out.println("start");
        Employee emp1 = new Employee(101, "ajay");
        emp1.displayemployeeinfo();
        Employee emp2 = new Employee(102,  "sangru");

        emp2.displayemployeeinfo();

        System.out.println("stop");


    }


}
