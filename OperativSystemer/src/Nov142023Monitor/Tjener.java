package Nov142023Monitor;

import java.util.Random;

public class Tjener extends Thread {
    private Faelles faelles;
    private boolean running;
    private int interval;

    public Tjener(Faelles faelles, int interval) {
        this.faelles = faelles;
        this.interval = interval;
        this.running = true;
    }

    public synchronized void run() {
        Random random = new Random();
        while (running) {
            try {
                Thread.sleep(interval);
                faelles.incrementOrderCount();
                System.out.println("Order received. Total orders: " + faelles.getOrderCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}
