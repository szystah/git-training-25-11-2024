package eu.chrost.javatraining.day3.exercises.constructors;

import java.math.BigDecimal;
/*

Zadanie 2: Bank z enkapsulacją
1.	Utwórz klasę BankAccount z prywatnymi polami:
o	String accountNumber
o	BigDecimal balance
Oba te pola powinny by ustawiane w konstruktorze, accountNumber powinno byc niemodyfikowalne
2.	Dodaj publiczne metody:
o	Getter dla balance i accountNumber
o	void deposit(BigDecimal amount) – dodaje środki do salda, ale tylko jeśli amount > 0.
o	void withdraw(BigDecimal amount) – odejmuje środki, jeśli amount > 0 i saldo jest wystarczające.
3.	W innym pakiecie utwórz klasę Main z metodą main(), która:
o	Tworzy konto bankowe i zarządza jego stanem przez metody.
o	Wyświetla saldo po każdej operacji.
 */


public class MyBankAccount {
    private final String accountNumber;
    private BigDecimal balance;

    public MyBankAccount(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public MyBankAccount(String accountNumber) {
        this(accountNumber, BigDecimal.ZERO);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(amount);
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            if (this.balance.compareTo(amount) >= 0) {
                this.balance = this.balance.subtract(amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    @Override
    public String toString() {
        return "MyBankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

