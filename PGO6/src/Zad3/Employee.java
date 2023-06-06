package Zad3;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person{

    protected LocalDate hireDate;
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, LocalDate hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate= hireDate;
        this.companyName= companyName;
        this.salary= salary;
    }

    public int getJobSeniority() {
        LocalDate currentDate= LocalDate.now();
        Period period= Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public double getSalary() {
        return salary;
    }
}
