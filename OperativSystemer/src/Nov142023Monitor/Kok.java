package Nov142023Monitor;

import java.util.Random;

public class Kok extends Thread {
    private Faelles faelles;
    private boolean running;
    private int interval;

    public Kok(Faelles faelles, int interval) {
        this.faelles = faelles;
        this.interval = interval;
        this.running = true;
    }

    public synchronized void run() {
        Random random = new Random();
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


