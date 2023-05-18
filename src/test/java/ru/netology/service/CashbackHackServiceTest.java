package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {


    @Test
   public void AddedAmountForCashback() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 500;
        assertEquals(expected,actual);
    }
    @Test
    public void AddedAmountForCashback1() {
        int amount = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void AddedAmountForCashback2() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void AddedAmountForCashback3() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain( amount);
        int expected = 999;
        assertEquals(expected,actual);
    }

}