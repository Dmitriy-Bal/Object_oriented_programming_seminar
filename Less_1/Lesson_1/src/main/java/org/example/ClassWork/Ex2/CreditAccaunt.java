package org.example.ClassWork.Ex2;

public class CreditAccaunt extends Accaunt {
    private Double prossent;

    public CreditAccaunt(Integer numAccaunt, String owner, Double balance, Double prossent) {
        super(numAccaunt, owner, balance);
        this.prossent = prossent;
    }

    public CreditAccaunt() {
    }

    public Double getProssent() {
        return prossent;
    }

    public void setProssent(Double prossent) {
        this.prossent = prossent;
    }

    protected void calculateInterest() {
        Double result = getBalance() * prossent / 100;
        withdraw(result);
    }
}
