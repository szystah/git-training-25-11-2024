package eu.chrost.javatraining.day4.exercises.inheritance.vehicles;

/*
Zadanie 2: Polimorfizm w pojazdach

1.	Utwórz klasę Vehicle z metodą:
o	public String getType(), która zwraca tekst "Generic Vehicle".
2.	Utwórz klasy Car i Truck, które dziedziczą po Vehicle:
o	Nadpisz metodę getType() w obu klasach, aby zwracała odpowiednio "Car" i "Truck".
3.	W metodzie main utwórz listę pojazdów (List<Vehicle>) zawierającą różne typy pojazdów.
Wykorzystaj polimorfizm, aby wywołać metodę getType() na każdym obiekcie.

 */

import java.util.ArrayList;
import java.util.List;

public class MyOwnMain {
    public static void main(String[] args) {
        List<MyOwnVehicle> myOwnVehicleList = new ArrayList<>();
        myOwnVehicleList.add(new MyOwnVehicle());
        myOwnVehicleList.add(new MyOwnCar());
        myOwnVehicleList.add(new MyOwnTruck());

        for (MyOwnVehicle v : myOwnVehicleList) {
            System.out.println(v.getType());
        }
    }
}
