package inheritance;

public class Manager extends Employee //keyword 'extends' --> it makes Manager a subclass of Employee.
{
    private double bonus;

    /**
    * @param name the employee's name
    * @param salary the employee's salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day); //keyword super --> it calls the constructor of the superclass Employee.
        bonus = 0;
    }

    public double getSalary() //a method that exists in the superclass can be modified in the subclass that inherits it.
    {
        double baseSalary = super.getSalary(); //keyword super --> it refers to a method of the superclass Employee. Otherwise, getSalary would call itself.
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        this.bonus = b;
    }

}
