package javaLang.mediator.Test2;

/**
 * 具体同事类：卖方
 */
public class Saller extends Custom {

    public Saller(String name) {
        super(name);
        clientWindow(50, 100);
    }

    @Override
    public void send(String ad) {
        receiveArea.append("卖方说：" + ad + "\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        receiveArea.append(from + "说：" + ad + "\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }
}
