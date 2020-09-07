package javaLang.visitor.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色：材料集
 */
public class SetMaterial {

    private List<Material> list = new ArrayList<>();

    public String accept(Company visitor) {
        Iterator<Material> i = list.iterator();

        String temp = "";

        while (i.hasNext()) {
            temp += ((Material) i.next()).accept(visitor) + " ";
        }

        //返回某公司的作品集
        return temp;
    }

    public void add(Material element) {
        list.add(element);
    }

    public void remove(Material element) {
        list.remove(element);
    }
}
