package school;

import java.util.Objects;
/**
 * Represents an employee in a school.
 */
abstract public class Employee {
    protected int age;
    protected String name;
    protected double salary;
    /**
     * Initializes an employee object with the specified name, age, and salary.
     * @param name   the name of the employee
     * @param age    the age of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the age of the employee.
     * @return the age of the employee
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the employee.
     * @param age the age of the employee
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the name of the employee.
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * @param name the name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the salary of the employee.
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * @param salary the salary of the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Returns a string representation of the employee.
     * @return a string representation of the employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o the object to compare to
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0
                && Objects.equals(name, employee.name);
    }

    /**
     * Defines the work behavior of the employee.
     */
    public abstract void Work();
}
