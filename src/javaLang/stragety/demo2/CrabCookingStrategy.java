package javaLang.stragety.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CrabCookingStrategy implements ItemListener {

    private JFrame jFrame;
    private JRadioButton rbQingzheng, rbHongshao;
    private JPanel centerJP, southJP;
    private Kitchen kitchen;
    private CrabCooking qingzhengCC, hongshaoCC;

    private CrabCookingStrategy() {
        jFrame = new JFrame("策略模式在大闸蟹做菜中的应用");
        jFrame.setBounds(100, 100, 500, 400);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        southJP = new JPanel();
        centerJP = new JPanel();
        jFrame.add("South", southJP);
        jFrame.add("Center", centerJP);

        rbQingzheng = new JRadioButton("清蒸大闸蟹");
        rbHongshao = new JRadioButton("红烧大闸蟹");

        rbHongshao.addItemListener(this);
        rbQingzheng.addItemListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(rbHongshao);
        group.add(rbQingzheng);

        southJP.add(rbQingzheng);
        southJP.add(rbHongshao);

        //厨房
        kitchen = new Kitchen();
        //清蒸大闸蟹
        qingzhengCC = new SteamedCrab();
        //红烧大闸蟹
        hongshaoCC = new BraisedCrab();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton button = (JRadioButton) e.getSource();

        if (button == rbHongshao) {
            kitchen.setStrategy(qingzhengCC);
        } else if (button == rbQingzheng) {
            kitchen.setStrategy(hongshaoCC);
        }

        kitchen.cookingMethod();

        centerJP.removeAll();
        centerJP.repaint();
        centerJP.add((Component) kitchen.getCrabStrategy());

    }

    public static void main(String[] args) {
        new CrabCookingStrategy();
    }
}
