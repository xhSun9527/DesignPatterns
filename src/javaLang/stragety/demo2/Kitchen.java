package javaLang.stragety.demo2;

/**
 * 环境类，厨房
 */
public class Kitchen {
    //抽象策略
    private CrabCooking crabStrategy;

    public void setStrategy(CrabCooking crabStrategy) {
        this.crabStrategy = crabStrategy;
    }

    public CrabCooking getCrabStrategy() {
        return this.crabStrategy;
    }

    public void cookingMethod() {
        //做菜
        crabStrategy.cookingMethod();
    }
}
