package Opg4;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Faelles {
    private static int globalCounter = 0;
    private Semaphore s = new Semaphore(1);

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
        try {
            s.acquire();
        int temp;
        temp = globalCounter;
        tagerRandomTid(100);
        globalCounter = temp + 1;
            s.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
