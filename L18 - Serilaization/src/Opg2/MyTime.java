package Opg2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {
    private int time = 0;
    private List<String> times;

    public int increase() {
        return time += 1;
    }
    public int reset() {
      return  time = 0;
    }

    public int getTime() {
        return time;
    }

    public void saveTime() {
        if(times == null) {
            times = new ArrayList<>();
        }
        times.add(String.valueOf(time));
    }
}
