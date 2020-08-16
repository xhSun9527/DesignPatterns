package javaLang.prototype.demo2;

import javax.swing.*;

/**
 * 孙悟空类
 */
public class SunWuKong extends JPanel implements Cloneable {

    public SunWuKong(){
        JLabel jLabel = new JLabel(new ImageIcon("src/images/sunwukong.jpeg"));
        this.add(jLabel);
    }

    public Object clone(){
        SunWuKong sunWuKong = null;

        try{
            sunWuKong = (SunWuKong) super.clone();

        }catch (Exception e){
            System.out.println("悟空拷贝失败");
        }
        return sunWuKong;
    }
}
