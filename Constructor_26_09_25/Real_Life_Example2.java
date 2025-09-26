package Constructor_26_09_25;

// Model class
class Student {
    String Name;
    int RollNumber;
    String Course;
    double Marks;

    // 0-arg constructor → default student
    Student() {
        this.Name = "Keshav";
        this.RollNumber = 60;
        this.Course = "Full Stack Java";
        this.Marks = 87.9;
        System.out.println("Default student created");
    }

    // 2-arg constructor → name and roll number
    Student(String Name, int RollNumber) {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.Course = "Unknown";
        this.Marks = 0.0;
        System.out.println("Student created with name and roll number");
    }

    // 4-arg constructor → full student info
    Student(String Name, int RollNumber, String Course, double Marks) {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.Course = Course;
        this.Marks = Marks;
        System.out.println("Full student created");
    }

    // Method 1 → display all student details
    void displayStudentDetails() {
        System.out.println("Name: " + Name + ", Roll: " + RollNumber + ", Course: " + Course + ", Marks: " + Marks);
    }

    // Method 2 → calculate grade
    void calculateGrade() {
        if (Marks >= 90) {
            System.out.println(Name + "'s Grade: A+");
        } else if (Marks >= 75) {
            System.out.println(Name + "'s Grade: A");
        } else if (Marks >= 60) {
            System.out.println(Name + "'s Grade: B");
        } else {
            System.out.println(Name + "'s Grade: C");
        }
    }

    // Method 3 → update marks
    void updateMarks(double newMarks) {
        this.Marks = newMarks;
        System.out.println(Name + "'s marks updated to " + Marks);
    }

    // Method 4 → change course
    void changeCourse(String newCourse) {
        this.Course = newCourse;
        System.out.println(Name + " changed course to " + Course);
    }
}

// Driver class
public class Real_Life_Example2 {
    public static void main(String[] args) {
        System.out.println("Start Student Registration\n");

        // Object using 0-arg constructor
        Student s1 = new Student();
        s1.displayStudentDetails();
        s1.calculateGrade();
        s1.updateMarks(95.0);
        s1.changeCourse("Data Science");
        System.out.println();

        // Object using 2-arg constructor
        Student s2 = new Student("Kiran", 50);
        s2.displayStudentDetails();
        s2.calculateGrade();
        s2.updateMarks(82.0);
        s2.changeCourse("AI & ML");
        System.out.println();

        // Object using 4-arg constructor
        Student s3 = new Student("Sangru", 20, "Full Stack Python", 87.9);
        s3.displayStudentDetails();
        s3.calculateGrade();
        s3.updateMarks(92.5);
        s3.changeCourse("Cloud Computing");

        System.out.println("\nEnd Student Registration");
    }
}
