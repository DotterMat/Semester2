package Opg1;

import java.util.Random;

import static java.util.logging.Logger.getLogger;

public class Faelles {
    private static int globalCounter = 0;

    public int getGlobalCounter() {
        return globalCounter;
    }

    public void tagerRandomTid(int max) {
        Random r = new Random();
        int nymax = Math.abs(r.nextInt()) % max + 1;
        for (int i = 0; i < nymax; i++) {
            for (int j = 0; j < nymax; j++) {
                int result = i + j - (i - j);
            }
        }
    }

    public void kritiskSektion() {
        int temp;
        temp = globalCounter;
        tagerRandomTid(100);
        globalCounter = temp + 1;
    }
}