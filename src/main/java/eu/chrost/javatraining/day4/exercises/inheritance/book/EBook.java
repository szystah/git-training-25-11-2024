package eu.chrost.javatraining.day4.exercises.inheritance.book;

public class EBook extends Book {
    @Override
    public String getDescription() {
        return "This is an e-book. & " + super.getDescription();
    }
}
