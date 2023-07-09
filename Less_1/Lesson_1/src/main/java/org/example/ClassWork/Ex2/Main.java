package org.example.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        CreditAccaunt creditAccaunt = new CreditAccaunt(12, "Ivan", 2000.0, 20.0);
        SavingAccaunt savingAccaunt = new SavingAccaunt(10, "qwe", 1000.0, 10.0);
        System.out.println("creditAccaunt.getBalance() = " + creditAccaunt.getBalance());
        creditAccaunt.calculateInterest();
        System.out.println("creditAccaunt.getBalance() = " + creditAccaunt.getBalance());
        System.out.println("savingAccaunt.getBalance() = " + savingAccaunt.getBalance());
        savingAccaunt.addInterest();
        System.out.println("savingAccaunt.getBalance() = " + savingAccaunt.getBalance());
    }
}
