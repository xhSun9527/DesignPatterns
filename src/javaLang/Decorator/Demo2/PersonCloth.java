package javaLang.Decorator.Demo2;

public abstract class PersonCloth extends Person{

    //保持一个Person类的引用
    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }


    @Override
    public void dressed() {
        //调用Person中的dress方法
        person.dressed();
    }
}
