package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void shouldAmountSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 180;
        int actual = service.amountSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expected = 5;
        int actual = service.aboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}