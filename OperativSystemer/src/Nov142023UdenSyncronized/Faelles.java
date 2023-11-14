package Nov142023UdenSyncronized;


public class Faelles {
    private int orderCount;
    private int cookedCount;

    public Faelles() {
        this.orderCount = 0;
        this.cookedCount = 0;
    }

    public void incrementOrderCount() {
        orderCount++;
    }

    public void incrementCookedCount() {
        cookedCount++;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public int getCookedCount() {
        return cookedCount;
    }
}



