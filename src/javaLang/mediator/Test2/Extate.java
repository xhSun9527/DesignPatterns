package javaLang.mediator.Test2;

import java.util.ArrayList;
import java.util.List;

public class Extate implements Medium {
    private List<Custom> customList = new ArrayList<>();

    @Override
    public void register(Custom custom) {
        if (!customList.contains(custom)) {
            customList.add(custom);
            custom.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Custom member : customList) {
            String name = member.getName();

            if (!name.equals(from)) {
                member.receive(from, ad);
            }
        }
    }
}
