package ru.netology.service;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void AddedAmountForCashbackTest() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 500;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void AddedAmountForCashbackTest1() {
        int amount = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 1;
        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void AddedAmountForCashbackTest2() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 0;
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void AddedAmountForCashbackTest3() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 999;
        org.testng.Assert.assertEquals(actual, expected);
    }
}