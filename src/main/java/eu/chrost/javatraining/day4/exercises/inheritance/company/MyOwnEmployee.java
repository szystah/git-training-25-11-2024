package eu.chrost.javatraining.day4.exercises.inheritance.company;

public class MyOwnEmployee {
    protected String name;
    protected double salary;

    public MyOwnEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: [" + name + "], Salary: [" + salary + "]";
    }
}
