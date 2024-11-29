package eu.chrost.javatraining.day4.exercises.inheritance.company;

public class MyOwnManager extends MyOwnEmployee {
    private String department;

    public MyOwnManager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager: [" + department + "], " + super.toString();
    }
}
