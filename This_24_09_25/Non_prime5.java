package This_24_09_25;

class IMS
{
    // Instance variables
    int studid;

    String studname;

    // Static variable (shared by all students )
    static String instituteName = "cyber success";

    // Method to set student info
    void setStudioinfo (int studid, String studname  )
    {
        // 'this.studid' refers to the instance variable
        // 'studid' on right-hand side is the method parameter
        this.studid = studid;
        this.studname = studname;
    }
    void getstudioinfo ()
{
    System.out.println("Student ID: " + studid +
            " | Student Name: " + studname +
            " | Institute: " + instituteName);}
    // Static method → belongs to class, not objects
static  void  attendance()
{
    System.out.println("Attendance marked for " + instituteName);
}
}

public class Non_prime5 {

    public static void main(String[] args) {
        System.out.println("start");

        IMS stud1 = new IMS ();
        stud1.setStudioinfo(101, "ajay ");
        stud1.getstudioinfo();

        IMS stud2 = new IMS();
        stud2.setStudioinfo(102, "Sneha");
        stud2.getstudioinfo();

        // call static method
        IMS.attendance();

        System.out.println("stop");
    }


}
