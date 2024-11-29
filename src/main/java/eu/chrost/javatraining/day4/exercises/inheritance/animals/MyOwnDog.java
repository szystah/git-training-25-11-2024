package eu.chrost.javatraining.day4.exercises.inheritance.animals;

public class MyOwnDog extends MyOwnAnimal {
    public String getBreed() {
        return "Unknown breed";
    }

    @Override
    public String getKingdom() {
        return "My Own Dog " + super.getKingdom();
    }

    //    String getSpecies() {
//    }
}
