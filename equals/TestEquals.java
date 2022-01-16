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

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob.toString());

        var carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);

        boss.setBonus(5000);
    }
}
