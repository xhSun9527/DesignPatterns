package stragety.demo2;

import javax.swing.*;

/**
 * 具体策略类，清蒸大闸蟹
 */
public class SteamedCrab extends JLabel implements CrabCooking {
    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/images/qingzheng.jpeg"));
        this.setHorizontalAlignment(CENTER);
    }
}
