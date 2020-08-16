package javaLang.interpreter.demo1;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("176 + 23 + 80");
        int result = calculator.calculate();
        System.out.println("结果为：" + result);
    }
}
