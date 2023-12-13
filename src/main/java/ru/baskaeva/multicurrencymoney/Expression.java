package ru.baskaeva.multicurrencymoney;

public interface Expression {
    Money reduce(String to);
}
