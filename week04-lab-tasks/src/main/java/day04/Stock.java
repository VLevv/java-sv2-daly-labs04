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
        double biggestDiff=0;
        for (double d :
                prices) {
            if (min > d) {
                min = d;
                max = min;
                for(int i = prices.indexOf(min);i< prices.size();++i){
                    if(max<prices.get(i)){
                        max=prices.get(i);
                    }
                }
                if(biggestDiff<max-min){
                    biggestDiff=max-min;
                }
            }
        }

        return biggestDiff;
    }
}