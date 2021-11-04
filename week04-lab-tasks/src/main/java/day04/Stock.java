package day04;

import java.util.List;

public class Stock {
    List<Double> prices;

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        double min = prices.get(0);
        double max = 0;
        for (double d :
                prices) {
            if (min > d) {
                min = d;
            }
        }
        for (int i = prices.indexOf(min);i<prices.size();++i) {
            if (max < prices.get(i)) {
                max = prices.get(i);
            }
        }
        return max-min;
    }
}