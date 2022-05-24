package ru.netology.statistics;

public class StatisticsService {
    public int amountSales(long[] sales) {
        int amount = 0;
        for (long sale : sales)
            amount += sale;
        return amount;
    }

    public int averageSales(long[] sales) {
        int average = amountSales(sales) / 12;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int amountMonth = 0;
        int average = averageSales(sales);
        for (long sale : sales)
            if (sale < average) amountMonth++;
        return amountMonth;
    }

    public int aboveAverageSales(long[] sales) {
        int amountMonth = 0;
        int average = averageSales(sales);
        for (long sale : sales)
            if (sale > average) amountMonth++;
        return amountMonth;
    }
}
