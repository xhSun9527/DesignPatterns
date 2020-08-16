package javaLang.factoryFunction.reflact;

public abstract class AudiFactory {

    /**
     * 某车型的抽象方法
     * @param clazz 具体的SUV型号类型
     * @param <T>
     * @return 具体型号的汽车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clazz);
}
