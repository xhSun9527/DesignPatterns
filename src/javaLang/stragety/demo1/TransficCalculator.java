package javaLang.stragety.demo1;

public class TransficCalculator {
    public static void main(String[] args) {
        TransficCalculator calculator = new TransficCalculator();

        calculator.setStragety(new BusStragety());
        System.out.println("公交车乘坐16公里的价格 ： " + calculator.calculatePrice(16));

    }

    CalculateStragety mStragety;

    public void setStragety(CalculateStragety calculateStragety) {
        this.mStragety = calculateStragety;
    }

    public int calculatePrice(int km) {
        return mStragety.calculatePrice(km);
    }
}
