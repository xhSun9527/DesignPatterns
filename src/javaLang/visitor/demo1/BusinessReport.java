package javaLang.visitor.demo1;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("赵工程师"));
        mStaffs.add(new Engineer("钱工程师"));
        mStaffs.add(new Engineer("孙工程师"));
        mStaffs.add(new Engineer("李工程师"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }

    }
}
