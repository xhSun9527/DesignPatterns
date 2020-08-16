package javaLang.builder.noamal;

/**
 * 负责构造Builder
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
    }
}
