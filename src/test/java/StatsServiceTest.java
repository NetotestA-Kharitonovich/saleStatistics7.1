package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSum() { //Сумма всех продаж
        StatsService service = new StatsService();
        int[] sales = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 1356;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);

    }


    @Test
    void shouldCalculateAvg() { //Средняя сумма продаж в месяц
        StatsService service = new StatsService();
        int[] sales = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 113;

        int actual = service.calculateAvg(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSumMaxMonth() { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        StatsService service = new StatsService();
        int[] maxMonth = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 7;

        int actual = service.sumMaxMonth(maxMonth);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSumMinMonth() { //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
        StatsService service = new StatsService();
        int[] minMonth = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 11;

        int actual = service.sumMinMonth(minMonth);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAmountMonthUnderAvg() { //Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();
        int[] amountMonthUnderAvg = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 4;

        long actual = service.amountMonthUnderAvg(amountMonthUnderAvg);

        assertEquals(expected, actual);
    }

    @Test
    void shouldamountMonthOverAvg() { //Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();
        int[] amountMonthOverAvg = {100, 107, 113, 115, 125, 121, 126, 116, 115, 118, 99, 101};
        int expected = 7;

        long actual = service.amountMonthOverAvg(amountMonthOverAvg);

        assertEquals(expected, actual);

    }

}