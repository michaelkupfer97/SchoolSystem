package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
/**
 * The SupportStaff class is an abstract class that represents a support staff member in a school.
 * It is a subclass of the Employee class and provides an implementation of the support method.
 */
abstract public class SupportStaff extends  Employee {
    /**
     * Constructs a new SupportStaff object with the given name, age, and salary.
     * @param name The name of the support staff member.
     * @param age The age of the support staff member.
     * @param salary The salary of the support staff member.
     */
    public SupportStaff(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * The support method is an abstract method that represents the type of support provided by the staff member.
     */
    abstract public void support();

    /**
     * Returns a string representation of the SupportStaff object.
     * @return A string representation of the SupportStaff object.
     */
    @Override
    public String toString() {
        return "SupportStaff{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
