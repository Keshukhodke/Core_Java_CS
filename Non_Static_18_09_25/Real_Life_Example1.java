package Non_Static_18_09_25;

class College {
    int no = 1000;  // total students (college level)
    static String university = "SPPU"; // University name

    static String getUniversity() {
        System.out.println("inside getUniversity()");
        return university;
    }

    // Computer Department
    static class Department {
        static String departmentName = "Computer";
        int teachers = 22;

        int getInfo() {
            System.out.println("inside " + departmentName + " department getInfo()");
            College c = new College();
            return c.no + teachers;  // students + teachers
        }
    }

    // E&TC Department
    static class Department1 {
        static String departmentName = "E&TC";
        int teachers = 15;

        int getInfo1() {
            System.out.println("inside " + departmentName + " department getInfo()");
            College c = new College();
            return c.no + teachers;
        }
    }
}

public class Real_Life_Example1 {
    public static void main(String[] args) {
        // University Info
        System.out.println("University: " + College.getUniversity());

        // Computer Department Info
        College.Department compDept = new College.Department();
        System.out.println("Computer Dept Info (students + teachers): " + compDept.getInfo());

        // E&TC Department Info
        College.Department1 entcDept = new College.Department1();
        System.out.println("E&TC Dept Info (students + teachers): " + entcDept.getInfo1());
    }
}
