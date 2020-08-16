package javaLang.prototype.demo1;

import java.util.ArrayList;

/**
 * 一个文档，保留副本
 * WordDocument相当于具体的原型角色
 * Cloneable相当于抽象的原型
 */
public class WordDocument implements Cloneable {

    //文本
    private String mText;

    //图片名列表
    private ArrayList<String> bitmapList = new ArrayList<>();

    public WordDocument() {
        System.out.println("----构造器-------");
    }

    @Override
    public WordDocument clone() {
        try {

            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            document.bitmapList = this.bitmapList;
            return document;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getBitmapList() {
        return bitmapList;
    }

    public void addBitmap(String name) {
        this.bitmapList.add(name);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("--------Word content start-------------");

        System.out.println("mText : " + mText);
        System.out.println("BitmapList : ");
        for (String name : bitmapList) {
            System.out.println("bitmap name : " + name);
        }
        System.out.println("--------Word content end-------------");

    }
}
