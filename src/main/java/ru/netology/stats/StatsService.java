package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) { //Сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) { //Средняя сумма продаж в месяц
        return calculateSum(sales) / sales.length;
    }

    public int sumMaxMonth(int[] sales) { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int sumMinMonth(int[] sales) { //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountMonthUnderAvg(int[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int count = 0;
        int salesAvg = calculateAvg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthOverAvg(int[] sales) { //Кол-во месяцев, в которых продажи были выше среднего
        int count = 0;
        int salesAvg = calculateAvg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }

}