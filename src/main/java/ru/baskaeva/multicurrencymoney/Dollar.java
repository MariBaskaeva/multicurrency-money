package ru.baskaeva.multicurrencymoney;

public class Dollar {
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }

    public int getAmount() {
        return amount;
    }
}
