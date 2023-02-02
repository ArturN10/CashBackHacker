package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfEqualTo1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }
}