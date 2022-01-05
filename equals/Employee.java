package equals;

import java.time.*;
import java.util.Objects;

public class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public boolean equals(Object otherObject)
    {
        //check if the objects are identical
        if (this == otherObject) return true;

        //returns false if explicit parameter is null
        if (otherObject == null) return false;

        //if the classes don't match, they can't be equal
        if (this.getClass() != otherObject.getClass()) return false;

        //otherObject is a non-null Employee
        var other = (Employee) otherObject;

        //check if the fields have identical values
        return Objects.equals(this.name, other.name)
          && this.salary == other.salary
          && Objects.equals(this.hireDay, other.hireDay);
    }
}
