public class FamilyPayment {

    public int totalPayment(int small, int big) {
        // Define the prices for daycare and SFA
        int daycarePrice = 2000;
        int sfaPrice = 1000;

        // Calculate the total cost for daycare and SFA
        int totalDaycareCost = small * daycarePrice;
        int totalSfaCost = big * sfaPrice;

        // Check the number of children to apply discounts
        if (small + big == 1) {
            // Only one child, no discount
            return totalDaycareCost + totalSfaCost;
        } else if (small + big >= 2 && small + big <= 3) {
            // Two or three children
            int maxChildCost = Math.max(daycarePrice, sfaPrice);
            int discount = (small * daycarePrice + big * sfaPrice) - maxChildCost;
            return maxChildCost + discount * 75 / 100;
        } else {
            // More than 3 children
            int maxChildCost = Math.max(daycarePrice, sfaPrice);
            int discount = (small * daycarePrice + big * sfaPrice) - maxChildCost;
            int extraChildren = small + big - 3;
            return maxChildCost + discount * 50 / 100 + extraChildren * maxChildCost * 50 / 100;
        }
    }
}

