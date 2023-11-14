package Nov142023Semaphore;


import java.util.concurrent.Semaphore;

public class Faelles {
    private int orderCount;
    private int cookedCount;
    private Semaphore sOrder;
    private Semaphore sCook;

    public Faelles() {
        this.orderCount = 0;
        this.cookedCount = 0;
        this.sOrder = new Semaphore(1);
        this.sCook = new Semaphore(1);
    }

    public void incrementOrderCount() throws InterruptedException {
        sOrder.acquire();
        orderCount++;
        sOrder.release();
    }

    public void incrementCookedCount() throws InterruptedException {
        sCook.acquire();
        cookedCount++;
        sCook.release();
    }

    public int getOrderCount() {
        return orderCount;
    }

    public int getCookedCount() {
        return cookedCount;
    }
}



