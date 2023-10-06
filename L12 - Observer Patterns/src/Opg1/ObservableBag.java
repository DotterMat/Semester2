package Opg1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ObservableBag implements Bag {
    private HashMap<String, Integer> elements = new HashMap<>();
    private ObserverBag observer;

    public void setObserver(ObserverBag obs) {
        this.observer = obs;
    }

    @Override
    public void add(String s) {
        if (elements.containsKey(s)) {
            int count = elements.get(s) + 1;
            elements.put(s, count);
            observer.elementAdded(s, count);
        } else {
            elements.put(s, 1);
            observer.elementAdded(s, 1);
        }
    }


    public HashMap<String, Integer> getElements() {
        return elements;
    }

    @Override
    public void remove(String s) {
        if (elements.containsKey(s)) {
            int count = elements.get(s) - 1;
            observer.elementRemove(s, count - 1);
            if (count == 0) {
                elements.remove(s);
            }
        }
    }

    @Override
    public int getCount(String s) {
        if (elements.containsKey(s)) {
            int count = elements.get(s);

            if (observer != null) {
                observer.elementAdded(s, count);
            }
            return count;
        } else {
            return 0;
        }
    }
}

