package javaLang.proxy.dynamic;

/**
 * 律师类
 */
public class Lawyer implements ILawSuit {

    private ILawSuit lawSuit;

    public Lawyer(ILawSuit lawSuit) {
        this.lawSuit = lawSuit;
    }

    @Override
    public void submit() {
        System.out.print("律师帮助---");
        lawSuit.submit();
    }

    @Override
    public void burden() {
        System.out.print("律师帮助---");
        lawSuit.burden();
    }

    @Override
    public void defend() {
        System.out.print("律师帮助---");
        lawSuit.defend();
    }

    @Override
    public void finish() {
        System.out.print("律师帮助---");
        lawSuit.finish();
    }
}
