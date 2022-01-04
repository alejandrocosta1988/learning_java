package abstractClasses;

public class Student extends Person
{

    private String major;

    /**
    * @param name the student's name
    * @param major the student's major
    **/
    public Student(String name, String major)
    {
        super(name); //name goes to the superclass's constructor
        this.major = major;
    }

    public String getDescription() //implementation of Person abstract method, so Student is a concrete class
    {
        return "a student majoring in " + major;
    }
}
