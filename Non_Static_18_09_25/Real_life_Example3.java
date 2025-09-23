package Non_Static_18_09_25;

class CyberSuccess {
    String instituteName = "Cyber Success";   // <-- Change Institute Name
    static String location = "Pune";          // <-- Change Location

    static String getLocation() {
        return location;
    }

    // -------------------- Software Testing Course --------------------
    static class SoftwareTesting {
        static String courseName = "Software Testing";  // <-- Change Course Name
        int duration = 4;     // in months  <-- Change Duration
        double fees = 35000;  // in Rs      <-- Change Fees
        String trainer = " miss . janhvi ";        // <-- Change Trainer Name

        void displayCourseInfo() {
            CyberSuccess cs = new CyberSuccess();
            System.out.println("===== " + courseName + " =====");
            System.out.println("Institute : " + cs.instituteName);
            System.out.println("Location  : " + CyberSuccess.getLocation());
            System.out.println("Duration  : " + duration + " months");
            System.out.println("Fees      : ₹" + fees);
            System.out.println("Trainer   : " + trainer);
            System.out.println("-----------------------------");
        }
    }

    // -------------------- Java Development Course --------------------
    static class JavaDevelopment {
        static String courseName = "Java Development";  // <-- Change Course Name
        int duration = 6;     // in months  <-- Change Duration
        double fees = 45000;  // in Rs      <-- Change Fees
        String trainer = "Mr . Ritesh sir";       // <-- Change Trainer Name

        void displayCourseInfo() {
            CyberSuccess cs = new CyberSuccess();
            System.out.println("===== " + courseName + " =====");
            System.out.println("Institute : " + cs.instituteName);
            System.out.println("Location  : " + CyberSuccess.getLocation());
            System.out.println("Duration  : " + duration + " months");
            System.out.println("Fees      : ₹" + fees);
            System.out.println("Trainer   : " + trainer);
            System.out.println("-----------------------------");
        }
    }
}

public class Real_life_Example3 {
    public static void main(String[] args) {
        System.out.println("🏫 Welcome to Cyber Success Institute");
        System.out.println("Location: " + CyberSuccess.getLocation());
        System.out.println("====================================");

        CyberSuccess.SoftwareTesting st = new CyberSuccess.SoftwareTesting();
        st.displayCourseInfo();   // Software Testing Info

        CyberSuccess.JavaDevelopment jd = new CyberSuccess.JavaDevelopment();
        jd.displayCourseInfo();   // Java Development Info
    }
}
