package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone phone1 = new Smartphone(3, "Galaxy S20+", 74990, "Samsung");
    private Smartphone phone2 = new Smartphone(4, "P40 128Gb", 39990, "Huawei");

    @Test
    void shouldMatchesName() {
        boolean actual = phone2.matches("P40 128Gb");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMatchesManufacturer() {
        boolean actual = phone1.matches("Samsung");
        boolean expected = true;
        assertEquals(expected, actual);
    }
}