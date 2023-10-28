package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sumsales = 0;
        for (long sale : sales) {
            sumsales += sale;

        }

        return sumsales;
    }

    public long average(long[] sales) {


        return sum(sales) / sales.length;
    }

    public int MonthMaxSales(long[] sales) {
        int MonthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[MonthMax] <= sales[i]) {
                MonthMax = i;
            }
        }

        return MonthMax + 1;
    }

    public int MonthMinSales(long[] sales) {
        int MonthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MonthMin]) {
                MonthMin = i;
            }
        }

        return MonthMin + 1;

    }

    public int MonthsBelowAverage(long[] sales) {
        long averagesale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averagesale) {
                counter++;

            }

        }
        return counter;
    }

    public int MonthsAboveAverage(long[] sales) {
        long averagesale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averagesale) {
                counter++;

            }

        }
        return counter;
    }
}
