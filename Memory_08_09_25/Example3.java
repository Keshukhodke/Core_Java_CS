package Memory_08_09_25;


class Students {

    int rollno;
    String name;

    void displayinfo()
    {
        System.out.println("roll number is "+ rollno);
        System.out.println("roll number is "+ name);
    }
}
public class Example3 {
    public static void main(String[] args) {
        Students s= new Students();
        s.rollno = 60;
        s.name= "Keshav";
        s.displayinfo();

        Students s1= new Students();
        s1.rollno = 45;
        s1.name = "KIran";

    }


}
