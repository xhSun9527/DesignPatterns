package javaLang.state.demo2;

public class Client {
    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        System.out.println("学生成绩单");

        context.add(30);
        context.add(40);
        context.add(98);
        context.add(10);
        context.add(70);
        context.add(-10);

    }
}
