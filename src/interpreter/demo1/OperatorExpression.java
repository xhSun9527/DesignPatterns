package interpreter.demo1;

/**
 * 运算符解释器
 */
public abstract class OperatorExpression extends AirthmeticExpression {

    //声明两个成员变量存储运算符两边的数字解释器
    protected AirthmeticExpression expression1,expression2;

    public OperatorExpression(AirthmeticExpression expression1, AirthmeticExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

}
