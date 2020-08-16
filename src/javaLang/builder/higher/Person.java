package javaLang.builder.higher;

/**
 * 创建一个Person类，name和gender是必须的，其他项可动态添加
 */
public class Person {
    /*名字（必须）*/
    private String name;
    /*性别（必须）*/
    private String gender;
    /*年龄（非必须）*/
    private String age;
    /*鞋子（非必须）*/
    private String shoes;
    /*衣服（非必须）*/
    private String clothes;
    /*钱（非必须）*/
    private String money;
    /*房子（非必须）*/
    private String house;

    public Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.shoes = builder.shoes;
        this.clothes = builder.clothes;
        this.money = builder.money;
        this.house = builder.house;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", shoes='" + shoes + '\'' +
                ", clothes='" + clothes + '\'' +
                ", money='" + money + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String gender;
        private String age;
        private String shoes;
        private String clothes;
        private String money;
        private String house;

        public Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setShoes(String shoes) {
            this.shoes = shoes;
            return this;

        }

        public Builder setClothes(String clothes) {
            this.clothes = clothes;
            return this;
        }

        public Builder setMoney(String money) {
            this.money = money;
            return this;
        }

        public Builder setHouse(String house) {
            this.house = house;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
