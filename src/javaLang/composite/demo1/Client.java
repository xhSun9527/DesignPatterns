package javaLang.composite.demo1;

public class Client {
    public static void main(String[] args) {

        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("diskC");


        File file1 = new File("file1.txt");
        diskC.addDir(file1);

        Dir dirWin = new Folder("windows");

        dirWin.addDir(new File("explore.exe"));
        diskC.addDir(dirWin);

        Dir diePer = new Folder("PerfLogs");

        diePer.addDir(new File("null.txt"));

        diskC.addDir(diePer);

        Dir dirPro = new Folder("Program File");
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);

        diskC.print();

    }
}
