package Zad3;

import java.time.LocalDate;

final class Manager extends Employee {

    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, LocalDate hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus= bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }

    public String toString() {
        return "Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}
