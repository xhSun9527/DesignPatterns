package interpreter.demo1;

/**
 * 加法运算抽象解释器
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(AirthmeticExpression expression1, AirthmeticExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
