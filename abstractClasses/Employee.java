package abstractClasses;

import java.time.*;

public class Employee extends Person // Employee is not abstract because it has defined all methods that were abstract in Person
{

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name); // Employee cannont access private variable name of abstract class Person. So it calls the constructor of the superclass. The call to the constructor of the superclass must be the first thing in the constructor of the subclass, otherwise it will call the superclass's constructor with no parameter. Here name was used as the parameter.
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
        return this.salary;
    }

    public LocalDate getHireDay()
    {
        return this.hireDay;
    }

    public String getDescription() // all concrete subclasses of Person must implement this method because it was abstarct in class Person
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }

}
