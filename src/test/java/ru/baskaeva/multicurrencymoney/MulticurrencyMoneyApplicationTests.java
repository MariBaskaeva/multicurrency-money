package ru.baskaeva.multicurrencymoney;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MulticurrencyMoneyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);

        assertEquals(10, five.getAmount());
    }

}
