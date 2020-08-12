package factoryFunction.normal;

/**
 * 抽象的工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法，具体生产什么由子类去决定
     *
     * @return
     */
    public abstract Product createProduct();
}
