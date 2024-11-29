package eu.chrost.javatraining.day2.exercises.methods;

/*

Zadanie 9: Liczba pierwsza
1.	Dodaj do klasy PrimeChecker metodę isPrime(int number) – sprawdza, czy liczba jest pierwsza.
2.	Dodaj przeciążoną wersję isPrime(int number, boolean verbose) – wypisuje proces sprawdzania na konsoli, gdy verbose = true.
3.	W main() wczytaj liczbę od użytkownika i przetestuj obie wersje metody.

 */

import java.util.ArrayList;
import java.util.List;

public class MyPrimeChecker {
    public static void main(String[] args) {
        int numberToVerify = 169;
        System.out.println("Czy liczba " + numberToVerify + " jest liczbą pierwszą: " + isPrime(numberToVerify, true));
        System.out.println("Czy liczba " + numberToVerify + " jest liczbą pierwszą: " + isPrime(numberToVerify));
        System.out.println("Liczby pierwsze do liczby " + numberToVerify + ": " + primeNumbers(numberToVerify, false));
    }

    public static List<Integer> primeNumbers(int number, boolean verbose) {
        List<Integer> primeNumbers = new ArrayList<>();
        boolean isPrime = false;
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
            if (verbose) {
                System.out.println("Liczba " + i + " jest liczbą pierwszą: " + isPrime);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int number, boolean verbose) {
        int divisorIteration = 2;
        boolean isDivisor;
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            isDivisor = false;
            if ((number % i == 0)) {
                divisorIteration++;
                isDivisor = true;
            }
            if (verbose) {
                System.out.println("Czy liczba " + i + " jest dzielnikiem liczby " + number + ": " + isDivisor);
            }
            if (divisorIteration > 2) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}