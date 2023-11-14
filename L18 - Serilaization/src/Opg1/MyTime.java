package Opg1;

import java.io.Serializable;

public class MyTime implements Serializable {
    private int time = 0;

    public int increase() {
        return time += 1;
    }
    public int reset() {
      return  time = 0;
    }

    public int getTime() {
        return time;
    }
}
