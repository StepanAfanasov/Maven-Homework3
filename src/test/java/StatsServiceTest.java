import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
class StatsServiceTest {
    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSales = 15;
        long actualAverageSales = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }
    @Test
    public void shouldCalculateBellowAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBellowAverageMonth = 5;
        int actualBellowAverageMonth = service.bellowAverageMonth(sales);
        Assertions.assertEquals(expectedBellowAverageMonth, actualBellowAverageMonth);
    }
    @Test
    public void shouldCalculateAboveAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageMonth = 5;
        int actualAboveAverageMonth = service.aboveAverageMonth(sales);
        Assertions.assertEquals(expectedAboveAverageMonth, actualAboveAverageMonth);
    }
}




