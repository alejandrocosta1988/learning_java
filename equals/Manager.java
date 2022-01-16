package equals;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public void setBonus(double bonusValue)
    {
        this.bonus = bonusValue;
    }
}
