package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246

/**
 * Represents the principal of the school.
 * Inherits from the {@link Administrator} class.
 */
public class Principal extends Administrator{
    /**
     * Constructs a new instance of the {@code Principal} class
     * with the specified name, age, and salary.
     * @param name the name of the principal
     * @param age the age of the principal
     * @param salary the salary of the principal
     */
    public Principal(String name, int age, double salary){
        super(name, age, salary);
    }

    /**
     * Prints a message indicating that the principal is working.
     */
    @Override
    public void Work(){
        System.out.println("The principal is working");
    }

    /**
     * Prints a message indicating that the principal is managing the school.
     */
    @Override
    public void manage(){
        System.out.println("the principal is maneging the school");
    }
}
