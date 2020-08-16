package javaLang.stragety.demo1;

public class SubwayStragety implements CalculateStragety {
    @Override
    public int calculatePrice(int km) {

        if (km <= 6) {
            return 3;
        } else if (km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;
    }
}
