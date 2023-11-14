package Nov142023Semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Tjener extends Thread {
    private Faelles faelles;
    private boolean running;
    private int interval;
    private Semaphore s = new Semaphore(100);

    public Tjener(Faelles faelles, int interval) {
        this.faelles = faelles;
        this.interval = interval;
        this.running = true;
    }

    public void run() {
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
