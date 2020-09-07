package javaLang.visitor.demo2;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 窗体类
 */
public class MaterialWin extends JFrame implements ItemListener {

    JPanel centerJp;
    SetMaterial os;
    Company visitor1, visitor2;
    String[] select;

    MaterialWin() {
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton art;
        JRadioButton mint;

        os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());

        //艺术公司
        visitor1 = new ArtCompany();
        //造币公司
        visitor2 = new Mint();

        centerJp = new JPanel();
        this.setBounds(10, 10, 750, 350);
        this.setResizable(false);

        centerJp = new JPanel();
        this.add("Center", centerJp);

        JPanel southJp = new JPanel();
        JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
        art = new JRadioButton("艺术公司", true);
        mint = new JRadioButton("造币公司");

        art.addItemListener(this);
        mint.addItemListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(art);
        buttonGroup.add(mint);

        southJp.add(yl);
        southJp.add(art);
        southJp.add(mint);
        this.add("south", southJp);
        select = os.accept(visitor1).split(" ");
        showPicture(select[0],select[1]);
    }

    void showPicture(String Cuprum, String paper) {
        centerJp.removeAll();    //清除面板内容
        centerJp.repaint();    //刷新屏幕
        String FileName1 = "src/visitor/Picture/" + Cuprum + ".jpg";
        String FileName2 = "src/visitor/Picture/" + paper + ".jpg";
        JLabel lb = new JLabel(new ImageIcon(FileName1), JLabel.CENTER);
        JLabel rb = new JLabel(new ImageIcon(FileName2), JLabel.CENTER);
        centerJp.add(lb);
        centerJp.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jc = (JRadioButton) e.getSource();
        if (jc.isSelected()) {
            if (jc.getText().equals("造币公司")) {
                select = (os.accept(visitor2)).split(" ");
            } else {
                select = (os.accept(visitor1)).split(" ");
            }
            showPicture(select[0], select[1]);    //显示选择的产品
        }
    }


}

