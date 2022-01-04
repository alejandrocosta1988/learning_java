package abstractClasses;

/**
* Program to demonstrate the use of abstract classes in Java language.
* @version 1.01 2004-02-21
* @author Cay Horstmann modified by Alejandro Costa 2022-01-04
**/

public class PersonTest
{
    public static void main(String[] args)
    {
        var people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person aPerson : people)
            System.out.println(aPerson.getName() + ", " + aPerson.getDescription());
    }
}
