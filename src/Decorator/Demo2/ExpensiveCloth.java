package Decorator.Demo2;

/**
 * 比较昂贵的衣服，
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt(){
        System.out.println("穿短袖");
    }

    private void dressLeather(){
        System.out.println("穿皮衣");
    }

    private void dressJeans(){
        System.out.println("穿牛仔");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressJeans();
        dressLeather();
    }
}
