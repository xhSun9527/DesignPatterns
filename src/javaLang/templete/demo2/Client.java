package javaLang.templete.demo2;

/**
 * 模板方法模式实现出国留学手续流程
 */
public class Client {

    public static void main(String[] args) {

        StudyAbroad studyAbroad = new StudyInAmerica();
        studyAbroad.templateMethod();
    }
}
