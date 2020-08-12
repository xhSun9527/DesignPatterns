package stragety.demo2;

import javax.swing.*;

/**
 * 具体策略类，红烧大闸蟹
 */
public class BraisedCrab extends JLabel implements CrabCooking {
    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/images/hongshao.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
