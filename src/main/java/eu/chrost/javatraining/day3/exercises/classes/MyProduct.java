package eu.chrost.javatraining.day3.exercises.classes;

/*

Zadanie 8: Klasa Product
1.	Utwórz klasę Product z polami:
o	String name
o	double price
o	int quantity
2.	Dodaj metody:
o	double calculateTotalPrice() – oblicza łączną cenę produktu (price * quantity).
o	boolean isSamePrice(Product other) – sprawdza, czy dwa produkty mają taką samą cenę.
3. Nadpisz metode equals() - tak aby porownywala czy dwa prodkty maja te same wartosci pol
4. Nadpisz metode toString() - tak aby zwracala wartosci pol
5.	W main():
o	Utwórz kilka obiektów klasy Product, ustawiając wartości pól bezpośrednio.
o	Porównaj obiekty za pomocą equals() i ==.
o	Oblicz łączną cenę produktów.


 */

import java.util.Objects;

public class MyProduct {
    public String name;
    public double price;
    public int quantity;

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public boolean isSamePrice(MyProduct product) {
        return this.price == product.price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyProduct myProduct)) return false;
        return myProduct.isSamePrice((MyProduct) o) && quantity == myProduct.quantity && Objects.equals(name, myProduct.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        MyProduct product1 = new MyProduct();
        product1.name = "led";
        product1.price = 1.2;
        product1.quantity = 3;

        MyProduct product2 = new MyProduct();
        product2.name = "bon";
        product2.price = 10.2;
        product2.quantity = 5;

        MyProduct product3 = new MyProduct();
        product3.name = "led";
        product3.price = 1.2;
        product3.quantity = 3;

        System.out.println("Czy product1 równa się product2 (equals): " + product1.equals(product2));
//        System.out.println("Czy product1 równa się product2 (==): "+product1==product2); // nie działa!
        System.out.println("Czy product1 równa się product3 (equals): " + product1.equals(product3));

        System.out.println("Łączny koszt produktów to " + (product1.calculateTotalPrice() + product2.calculateTotalPrice() + product3.calculateTotalPrice()));
    }
}
