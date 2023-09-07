package school;
/**
 * Represents a science teacher that extends the "Teacher" class and has the ability to generate physics questions.
 */
import java.util.Scanner;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
public class ScienceTeacher extends Teacher{
    /**
     * Constructor for the ScienceTeacher class that takes in a name, age, and salary, and calls the super constructor with those parameters as well as the subject "Science".
     * @param name the name of the science teacher
     * @param age the age of the science teacher
     * @param salary the salary of the science teacher
     */
    public ScienceTeacher(String name, int age, double salary){
        super(name, age, salary,"Science");
    }

    /**
     * Overrides the "Work" method from the "Teacher" class to print out a message specific to a science teacher's job.
     */
    @Override
    public void Work(){
        System.out.println("The science teacher is working");
    }

    /**
     * Overrides the "teach" method from the "Teacher" class to print out a message specific to a science teacher's job.
     */
    @Override
    public void teach(){
        System.out.println("The science teacher is teaching science");
    }

    /**
     * Generates a physics problem with random values for mass and acceleration, prompts the user to input an answer, and then checks whether the answer is correct by comparing it to the calculated force.
     * If the answer is correct, it prints out a congratulatory message, otherwise it prints out the correct answer.
     */
    public void generateQuestion() {
        Scanner scan = new Scanner(System.in);
        double mass = ((Math.random()) * 100);
        double accelerate = ((Math.random()) * 10);
        double f = mass * accelerate;
        System.out.println("A " + mass + " gram object is accelerating at " + accelerate + "m/s^2."
                + "\n" + "What is the resulting force in Newtons?"
                + "\n" + "Please enter your answer.");

        double answer = scan.nextDouble();
        if (answer == f) {
            System.out.println("good jod. correct answer.");
        } else {
            System.out.println("wrong answer. the correct answer is: " + f);
        }
    }

}
