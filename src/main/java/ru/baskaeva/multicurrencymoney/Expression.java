package ru.baskaeva.multicurrencymoney;

public interface Expression {
    Money reduce(Bank bank, String to);
}
