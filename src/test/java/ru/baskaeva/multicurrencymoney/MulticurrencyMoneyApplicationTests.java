package ru.baskaeva.multicurrencymoney;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MulticurrencyMoneyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        Dollar product = five.times(2);
        assertEquals(10, product.getAmount());

        product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
