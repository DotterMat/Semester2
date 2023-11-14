package Nov142023Semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Kok extends Thread {
    private Faelles faelles;
    private boolean running;
    private int interval;
    private Semaphore s = new Semaphore(100);

    public Kok(Faelles faelles, int interval) {
        this.faelles = faelles;
        this.interval = interval;
        this.running = true;
    }


    public void run() {
        while (running) {
            try {
                Thread.sleep(interval);
                if (faelles.getOrderCount() > faelles.getCookedCount()) {
                    faelles.incrementCookedCount();
                    System.out.println("Order cooked. Total cooked: " + faelles.getCookedCount());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}


