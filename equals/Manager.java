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

    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;
        var other = (Manager) otherObject;
        //super.equals checked that this and other belong to the same class
        return this.bonus == other.bonus;
    }

    public String toString()
    {
        return super.toString() + "[bonus = " + this.bonus + "]";
    }
}
