class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "Saffrony Institute of Technology";
        totalStudents = 0;
        System.out.println("Static Block Executed");
        System.out.println("University Name Initialized: " + universityName);
    }

    {
        System.out.println("Instance Block Executed");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("-------------------------");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");
        System.out.println("-------------------------");

        University s1 = new University();
        University s2 = new University();

        System.out.println("Final Total Students: " + University.getTotalStudents());
    }
}
