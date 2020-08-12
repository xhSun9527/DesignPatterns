package factoryFunction.reflact;

public class AudiQ5 extends AudiCar {


    @Override
    public void drive() {
        System.out.println("Q5汽车启动了");
    }

    @Override
    public void selfNavigation() {

        System.out.println("Q5开始自动巡航");
    }
}
