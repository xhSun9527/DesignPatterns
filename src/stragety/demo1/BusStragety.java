package stragety.demo1;

/**
 * 公交车计算价格策略
 */
public class BusStragety implements CalculateStragety {

    @Override
    public int calculatePrice(int km) {
        //超过10公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离5公里取余
        int fraction = extraTotal % 5;

        int price = 1 + extraFactor;
        return fraction > 0 ? ++price : price;
    }
}
