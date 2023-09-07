package school;
/**
 * An abstract class representing an administrator.
 */
abstract public class Administrator extends Employee {


    /**
     * Constructor for the Administrator class that takes in a name, age, and salary, and calls the super constructor with those parameters.
     * @param name   the name of the administrator
     * @param age    the age of the administrator
     * @param salary the salary of the administrator
     */
    public Administrator(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * An abstract method to manage an administrative task. This method is meant to be implemented by non-abstract subclasses of Administrator.
     */
    public abstract void manage();

    /**
     * method return a string representation of an Administrator object, including the age, name, and salary of the administrator.
     * @return a string representation of an Administrator object
     */
    @Override
    public String toString() {
        return "Administrator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
