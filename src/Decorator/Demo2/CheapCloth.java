package Decorator.Demo2;

/**
 * 比较低廉的衣服
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    private void dressShorts() {
        System.out.println("穿短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
