package javaLang.templete.demo1;

public class Client {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();

        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
