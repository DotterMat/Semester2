package Nov142023Monitor;


public class Faelles {
    private int orderCount;
    private int cookedCount;

    public Faelles() {
        this.orderCount = 0;
        this.cookedCount = 0;
    }

    public synchronized void incrementOrderCount() {
        orderCount++;
        notify();
    }

    public synchronized void incrementCookedCount() {
        cookedCount++;
        notify();
    }

    public synchronized void waitForOrders() throws InterruptedException {
        while (getOrderCount() <= getCookedCount()) {
            wait();
        }
    }

    public synchronized void waitForCookedOrders() throws InterruptedException {
        while (getCookedCount() >= getOrderCount()) {
            wait();
        }
    }
    public int getOrderCount() {
        return orderCount;
    }

    public int getCookedCount() {
        return cookedCount;
    }
}



