package prototype;

import prototype.demo1.WordDocument;
import prototype.demo2.SunWuKong;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {

        wukong();
    }

    private static void documentTest(){
        //构建文档对象
        WordDocument document = new WordDocument();
        //编辑文档，添加图片
        document.setmText("这是一篇文档");
        document.addBitmap("图片1");
        document.addBitmap("图片2");
        document.addBitmap("图片3");
        //展示文档
        document.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument copyDocument = document.clone();
        copyDocument.showDocument();

        //修改副本文档，不会影响原始文档
        copyDocument.setmText("这是修改过的副本");
        copyDocument.showDocument();

        document.showDocument();
    }

    private static void wukong(){
        JFrame jFrame = new JFrame("原型测试");
        jFrame.setLayout(new GridLayout(1,2));
        Container container = jFrame.getContentPane();
        SunWuKong sunWuKong1 = new SunWuKong();
        container.add(sunWuKong1);

        SunWuKong sunWuKong2 = (SunWuKong) sunWuKong1.clone();
        container.add(sunWuKong2);

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
