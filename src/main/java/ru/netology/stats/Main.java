package ru.netology.stats;
public class Main {
    public static <StatsService> void main(String[] args) {
        StatsService service = new StatsService();
        int[] minSales = service.sales(8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18);
        System.out.println(minSales);
    }
}