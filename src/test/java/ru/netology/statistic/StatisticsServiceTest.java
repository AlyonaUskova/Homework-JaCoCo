package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWithoutSameValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {19, 5, 1, 4, 14, 3, 8, 6, 10, 11, 12};
        long expected = 19;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxSameValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3};
        long expected = 3;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}