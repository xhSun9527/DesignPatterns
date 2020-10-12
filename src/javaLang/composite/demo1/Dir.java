package javaLang.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件和文件夹的抽象类
 */
public abstract class Dir {

    //声明一个List成员变量，存储文件夹下所有元素
    public List<Dir> dirs = new ArrayList<>();

    //当前文件或文件夹名
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    //添加一个文件或文件夹
    public abstract void addDir(Dir dir);

    //移除一个文件或文件夹
    public abstract void rmDir(Dir dir);

    //输出文件夹目录结构
    public abstract void print();

    //清空文件夹下所有元素
    public abstract void clear();

    //获取文件夹下所有文件或文件夹
    public abstract List<Dir> getFiles();

    public String getName(){
        return name;
    }
}
