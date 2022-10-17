package compositeArmy;

import java.util.ArrayList;
import java.util.List;

public class CompositeHuman implements Human {

    private List<Human> childList = new ArrayList<>();
    private String unitName;

    public CompositeHuman(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public void say() {
        for (Human human : childList) {
            human.say();
        }
    }

    public void add(Human human) {
        childList.add(human);
    }

    public void remove(Human human) {
        childList.remove(human);
    }

    public void sayAll() {
        System.out.println("총 " + childList.size() + unitName + "입니다.");
    }
}
