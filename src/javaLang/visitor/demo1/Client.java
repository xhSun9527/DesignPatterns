package javaLang.visitor.demo1;

public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();

        System.out.println("========这是给CEO看的报表===========");
        businessReport.showReport(new CEOVisitor());
        System.out.println("========这是给CTO看的报表===========");
        businessReport.showReport(new CTOVisitor());
    }
}
