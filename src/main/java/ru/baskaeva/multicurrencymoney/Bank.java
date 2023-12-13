package ru.baskaeva.multicurrencymoney;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
