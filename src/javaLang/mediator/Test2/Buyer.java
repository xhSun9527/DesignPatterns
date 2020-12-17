package javaLang.mediator.Test2;

public class Buyer extends Custom {
    public Buyer(String name) {
        super(name);
        clientWindow(350, 100);
    }

    @Override
    public void send(String ad) {
        receiveArea.append("我(买方)说: " + ad + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        receiveArea.append(from + "说: " + ad + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }
}
