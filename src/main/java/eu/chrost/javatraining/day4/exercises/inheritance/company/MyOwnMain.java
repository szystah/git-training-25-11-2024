package eu.chrost.javatraining.day4.exercises.inheritance.company;

/*
Zadanie 1: Polimorfizm w hierarchii pracowników
1.	Utwórz klasę Employee z polami:
o	String name (protected),
o	double salary (protected).
2.	Dodaj konstruktor oraz metodę toString(), która zwraca tekst: "Employee: [name], Salary: [salary]".
3.	Utwórz klasę Manager, która dziedziczy po Employee:
o	Dodaj pole String department (private).
o	Nadpisz metodę toString(), aby zawierała również informację o departamencie.
o	Wykorzystaj super.toString() w implementacji metody.
4.	W klasie Main utwórz tablicę pracowników (Employee[]), w której znajdą się
zarówno obiekty Employee, jak i Manager. Wykorzystaj pętlę, aby wyświetlić
dane wszystkich pracowników.


*/

public class MyOwnMain {

    public static void main(String[] args) {

        MyOwnEmployee[] myOwnEmployees = new MyOwnEmployee[2];

        MyOwnEmployee myOwnEmployee = new MyOwnEmployee("Bob", 1234.5);
        MyOwnManager myOwnManager = new MyOwnManager("John", 5432.1, "Dummy things");

        myOwnEmployees[0] = myOwnEmployee;
        myOwnEmployees[1] = myOwnManager;

        for (MyOwnEmployee e : myOwnEmployees) {
            System.out.println(e);
        }

    }
}
