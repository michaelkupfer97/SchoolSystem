package school;
//assignment : 3
// Author: Michael Kupfer  ID:209493246
import java.util.Objects;
/**
 * The abstract `Teacher` class represents a teacher in a school. It is a subclass of `Employee` and
 * contains information about the teacher's subject. It also defines the `teach` and `generateQuestion`
 * methods that must be implemented by subclasses.
 */
abstract public class Teacher extends Employee {
    /**
     * The subject taught by this teacher.
     */
    protected final String subject;
    /**
     * Constructs a new `Teacher` object with the specified name, age, salary, and subject.
     * @param name the name of the teacher
     * @param age the age of the teacher
     * @param salary the salary of the teacher
     * @param subject the subject taught by the teacher
     */
    public Teacher(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    /**
     * Abstract method that must be implemented by subclasses to define the teacher's method of teaching.
     */
    abstract public void teach();

    /**
     * Abstract method that must be implemented by subclasses to generate a question related to the teacher's subject.
     */
    abstract public void generateQuestion();

    /**
     * Returns the subject taught by this teacher.
     * @return the subject taught by this teacher
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Returns a string representation of this teacher, including the subject, name, age, and salary.
     * @return a string representation of this teacher
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    /**
     * Compares this teacher to the specified object for equality. Returns true if and only if the specified
     * object is also a teacher and has the same name, age, salary, and subject.
     * @param o the object to be compared for equality with this teacher
     * @return true if the specified object is equal to this teacher, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(subject, teacher.subject);
    }
}
