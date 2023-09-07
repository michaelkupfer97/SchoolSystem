package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
import java.util.Scanner;
/**
 * A class representing a math teacher in a school.
 * Inherits from the Teacher class.
 */
public class MathTeacher extends Teacher{
    /**
     * Constructor for MathTeacher class.
     * @param name the name of the math teacher.
     * @param age the age of the math teacher.
     * @param salary the salary of the math teacher.
     */
    public MathTeacher(String name, int age, double salary){
        super(name, age, salary,"Mathematics");
    }

    /**
     * The work method for the math teacher.
     * Prints a message indicating that the math teacher is working.
     */
    @Override
    public void Work(){
        System.out.println("The math teacher is working");
    }

    /**
     * The teach method for the math teacher.
     * Prints a message indicating that the math teacher is teaching math.
     */
    @Override
    public void teach(){
        System.out.println("The math teacher is teaching math");
    }

    /**
     * Generates a multiplication question with random numbers and asks the user to solve it.
     * If the answer is correct, prints a "good job" message. Otherwise, prints the correct answer.
     */
    public void generateQuestion() {
        Scanner scan = new Scanner(System.in);
        int x = (int) ((Math.random()) * 10);
        int y = (int) ((Math.random()) * 10);
        int f = x * y;
        System.out.println("What is  " + x + '*' + y + "?."
                + "\n" + "Please enter your answer.");
        int answer = scan.nextInt();
        if (answer == f) {
            System.out.println("good jod. correct answer.");
        } else {
            System.out.println("wrong answer. the correct answer is: " + f);
        }
    }

}
