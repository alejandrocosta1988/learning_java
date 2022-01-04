package abstractClasses;

public abstract class Person //keyword: abstract --> it is used when one or more methods of the class are abstract.
{
    private String name; //abstract classes may have concrete fields.
    public abstract String getDescription(); //abstract methods need no implementation. These methods must be implemented in the concrete subclasses that inherit from the abstract superclass.

    public Person(String name)
    {
        this.name = name;
    }

    public String getName() //abstract classes may have concrete methods.
    {
        return this.name;
    }
}
