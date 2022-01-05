package equals;

/**
* Program to demonstrate the use of the method equals
* @version 1.12 2012-01-26
* @author Cay Horstmann modified by Alejandro Costa 2022-01-05
*/
public class TestEquals
{
    public static void main(String[] args)
    {
        var alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
    }
}
