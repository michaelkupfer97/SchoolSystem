package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
/**
 * Represents a Vice Principal, a type of Administrator in a school.
 * Inherits from the Administrator class.
 */
public class VicePrincipal extends Administrator{
    /**
     * Constructs a new VicePrincipal object with the given name, age, and salary.
     * @param name the name of the Vice Principal
     * @param age the age of the Vice Principal
     * @param salary the salary of the Vice Principal
     */
    public VicePrincipal(String name, int age, double salary){
        super(name, age, salary);
    }
    /**
     * Prints a message indicating that the Vice Principal is working.
     */
    @Override
    public void Work(){
        System.out.println("The vice principal is working");
    }
    /**
     * Prints a message indicating that the Vice Principal is assisting the Principal.
     */
    @Override
    public void manage(){
        System.out.println("the vice principal is assisting the principal");
    }
}
