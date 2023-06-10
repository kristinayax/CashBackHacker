package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    void shouldFindCashbackIfPriceMoreThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void shouldFindCashbackIfPriceLessThanThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // тест падает, хотя логически написан правильно
    @Test
    void shouldFindCashbackIfPriceEqualsThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}