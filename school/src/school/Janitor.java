package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
/**
 * The Janitor class represents a janitor in a school.
 * It extends the SupportStaff class and inherits its properties and methods.
 */
public class Janitor extends SupportStaff {
    /**
     * Constructs a Janitor object with the specified name, age, and salary.
     * @param name The name of the janitor.
     * @param age The age of the janitor.
     * @param salary The salary of the janitor.
     */
    public Janitor(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * Prints a message to indicate that the janitor is working.
     */
    @Override
    public void Work() {
        System.out.println("the janitor is working.");
    }

    /**
     * Prints a list of 10 items with a random amount for each item.
     */
    @Override
    public void support() {
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 10);
            System.out.println("Item #" + (i+1) + "\t" + "amount:" + x);
        }
    }
}
