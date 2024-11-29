package eu.chrost.javatraining.day4.exercises.inheritance.book;

/*
* Zadanie 4: Super i nadpisywanie metod
1. Utwórz klasę Book z metodą:
- public String getDescription(), która zwraca "This is a book.".
2. Utwórz klasę EBook, która dziedziczy po Book:
- Nadpisz metodę getDescription(), aby zwracała "This is an e-book.".
- Wykorzystaj super.getDescription() do dodania informacji o tym, że jest to książka.
3. W klasie main utwórz obiekty obu typów i wywołaj metodę getDescription().
* */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Book().getDescription());
        System.out.println(new EBook().getDescription());
    }
}
