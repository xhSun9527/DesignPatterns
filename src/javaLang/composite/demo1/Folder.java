package javaLang.composite.demo1;

import java.util.Iterator;
import java.util.List;

/**
 * 表示文件夹的类
 */
public class Folder extends Dir {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void print() {
        System.out.println(getName() + "(");
        Iterator<Dir> iterator = dirs.iterator();

        while (iterator.hasNext()){
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()){
                System.out.println(",");
            }
        }
        System.out.println(")");
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
