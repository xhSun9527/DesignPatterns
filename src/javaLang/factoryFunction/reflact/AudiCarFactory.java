package javaLang.factoryFunction.reflact;

public class AudiCarFactory extends AudiFactory {


    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clazz) {
        AudiCar car = null;
        try {
            car = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
