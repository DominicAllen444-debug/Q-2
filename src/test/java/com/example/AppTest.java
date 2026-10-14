package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void identifiesEvenNumbers() {
        assertTrue(new App().isEven(8));
        assertTrue(new App().isEven(0));
        assertTrue(new App().isEven(-4));
    }

    @Test
    void identifiesOddNumbers() {
        assertFalse(new App().isEven(7));
        assertFalse(new App().isEven(-3));
    }
}
