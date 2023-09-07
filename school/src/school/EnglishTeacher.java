package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
import java.util.Scanner;

public class EnglishTeacher extends Teacher{
    /**
     * Constructs an EnglishTeacher object with a name, age, salary and subject.
     * @param name The name of the English teacher.
     * @param age The age of the English teacher.
     * @param salary The salary of the English teacher.
     */
    public EnglishTeacher(String name, int age, double salary){
        super(name, age, salary,"English");
    }

    /**
     * Prints a message indicating that the English teacher is working.
     */
    @Override
    public void Work(){
        System.out.println("The English teacher is working");
    }

    /**
     * Prints a message indicating that the English teacher is teaching English.
     */
    @Override
    public void teach(){
        System.out.println("The English teacher is teaching English");
    }

    /**
     * Generates a random English question and prompts the user to answer it.
     * Possible question types: Spell, Define, Use in sentence, Rhyme with, Antonym of, Synonym of.
     */
    public void generateQuestion() {
        Scanner scan = new Scanner(System.in);
        String[] arr = {"cat", "dog", "tree", "book", "cup", "sun", "moon", "star", "car", "house"};
        int rnd = (int) ((Math.random()) * 9);

        String[] actions = {"Spell", "Define", "Use in sentence", "Rhyme with", "Antonym of", "Synonym of"};
        int y = (int) ((Math.random()) * 6);

        System.out.println(actions[y] + arr[rnd]
                + "\n" + "Please enter your answer.");
        String answer = scan.next();
        System.out.println("Your answer is: " + answer);
    }
}

