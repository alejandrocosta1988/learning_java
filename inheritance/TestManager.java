package inheritance;

// program to demonstrate inheritance
public class TestManager
{
    public static void main(String[] args)
    {
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss; //Object variables are polymorphic. A variable of type Employee can refer to an Employee instance, but also to an instance of any subclass of Employee, such as Manager. But... it will be considered an Employee by the compiler. So, you can use boss.setBonus(500), but you cannot use staff[0].setBonus(500), because it is seen as an Employee.
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee e : staff)
            System.out.println("Name = " + e.getName() + "\nSalary = " + e.getSalary());
    }
}
