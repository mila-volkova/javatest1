package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert;

class CashbackHackServiceTest {


    @Test
   public void AddedAmountForCashback() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 500;
        assertEquals(actual,expected);
    }
    @Test
    public void AddedAmountForCashback1() {
        int amount = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void AddedAmountForCashback2() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void AddedAmountForCashback3() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 999;
        org.testng.Assert(actual,expected);
    }

}