public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSales = totalSale / 12;
        return averageSales;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int bellowAverageMonth(long[] sales) {
        int counter = 0;
        long avarage = averageSales(sales);
        for (long sale : sales) {
            if (sale < avarage) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverageMonth(long[] sales) {
        int counter = 0;
        long avarage = averageSales(sales);
        for (long sale : sales) {
            if (sale > avarage) {
                counter++;
            }
        }
        return counter;
    }
}