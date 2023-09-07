package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
/**
 * The Secretary class represents a support staff member who works as a school secretary.
 * This class extends the SupportStaff class and overrides its abstract methods.
 */
public class Secretary extends SupportStaff {
    /**
     * Constructor for creating a new Secretary object with the given name, age, and salary.
     * @param name   the name of the secretary
     * @param age    the age of the secretary
     * @param salary the salary of the secretary
     */
    public Secretary(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * Overrides the Work method from the SupportStaff class to print a message
     * indicating that the Secretary is working.
     */
    @Override
    public void Work() {
        System.out.println("the Secretary is working.");
    }

    /**
     * Overrides the support method from the SupportStaff class to print a list of grades for 30 students.
     * Each student is identified by a number and their grade is generated randomly between 0 and 100.
     */
    @Override
    public void support() {
        for (int i = 0; i < 30; i++) {
            int x = (int) (Math.random() * 100);
            System.out.println("Student #" + (i+1) + "\t" + "grade:" + x);
        }
    }
}
