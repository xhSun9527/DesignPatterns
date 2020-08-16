package interpreter.demo1;

import java.util.Stack;

/**
 * 处理与解释相关的一些业务
 */
public class Calculator {
    //声明一个栈存储并操作所有相关的解释器
    private Stack<AirthmeticExpression> mExpressionStack = new Stack<>();

    public Calculator(String expression) {
        //声明两个临时变量，存储运算符左右两遍的数字解释器
        AirthmeticExpression exp1, exp2;

        //根据空格分隔表达式字符串
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            //判断运算符
            switch (elements[i].charAt(0)) {
                //如果是 +
                case '+':
                    //将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpressionStack.pop();
                    //同时将运算符号数组下标下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[i + 1]));
                    //通过上面两个数字解释器构造加法运算解释器
                    mExpressionStack.push(new AdditionExpression(exp1, exp2));
                    break;
                default:
                    //如果不是运算符则作为数字，若是数字，直接构造数字解释器并压入栈
                    mExpressionStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 运算
     *
     * @return
     */
    public int calculate() {
        return mExpressionStack.pop().interpret();
    }
}
