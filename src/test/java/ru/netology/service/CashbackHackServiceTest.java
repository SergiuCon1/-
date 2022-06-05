package ru.netology.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldGetRemains200() {

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1000() {

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1100() {

        int amount = -100;

        int actual = service.remain(amount);
        int expected = 1100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1() {

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Ignore
    @Test
    public void shouldGetRemains0WhenAmount1000() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains999() {

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1000WhenBigAmount() {

        int amount = 1000000000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    //API JUnit Jupiter

    @org.junit.jupiter.api.Test
    public void shouldGetRemains200API() {

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldGetRemains1000API() {

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldGetRemains1100API() {

        int amount = -100;

        int actual = service.remain(amount);
        int expected = 1100;

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldGetRemains1API() {

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Disabled
    @org.junit.jupiter.api.Test
    public void shouldGetRemains0WhenAmount1000API() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldGetRemains999API() {

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldGetRemains1000WhenBigAmountAPI() {

        int amount = 1000000000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(actual, expected);
    }
}