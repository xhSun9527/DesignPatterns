package javaLang.visitor.demo2;

/**
 * 具体访问者，艺术公司
 */
public class ArtCompany implements Company {
    @Override
    public String create(Paper element) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum element) {
        return "孔子铜像";
    }
}
