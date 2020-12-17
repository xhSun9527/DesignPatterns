package javaLang.mediator.Test1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {

        for (Colleague coll : colleagueList) {
            if (coll.equals(colleague)) {
                coll.receive();
            }
        }
    }
}
