package eu.chrost.javatraining.day4.exercises.inheritance.animals;

/*
Zadanie 3: Finalizacja metod

1.	Utwórz klasę Animal z metodą:
o	public final String getSpecies(), która zwraca tekst "Generic Animal".
2.	Utwórz klasę Dog, która dziedziczy po Animal:
o	Dodaj metodę String getBreed(), która zwraca tekst "Unknown breed".
3.	Spróbuj nadpisać metodę getSpecies() w klasie Dog i zaobserwuj, co się dzieje.
4.	W metodzie main utwórz obiekt Dog i wywołaj obie metody.


* Zadanie 6: Współdziałanie z finalnymi polami
W klasie Animal dodaj finalne pole String kingdom = "Animalia";.
Utwórz metodę public String getKingdom(), która zwraca wartość tego pola.
W klasie Dog spróbuj zmodyfikować to pole i zaobserwuj, co się dzieje.
W klasie main wyświetl wartość pola kingdom dla obiektu klasy Dog
 */

public class MyOwnMain {
    public static void main(String[] args) {
        MyOwnDog dog = new MyOwnDog();
        System.out.println(dog.getSpecies());
        System.out.println(dog.getBreed());
        System.out.println(dog.getKingdom());
    }
}
