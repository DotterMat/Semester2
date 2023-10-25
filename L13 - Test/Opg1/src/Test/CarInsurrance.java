package Test;

public class CarInsurrance {
    private final double basisPremium;

    public CarInsurrance(double basisPremium) {
        this.basisPremium = basisPremium;
    }

    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        if (age < 18 || yearsWithoutDamage < 0 || yearsWithoutDamage > age - 18) {
            throw new RuntimeException("Invalid input");
        }

        double premium = basisPremium;
        if (age < 25) {
            premium *= 1.25; // 25% added for age < 25
        }

        if (isWoman) {
            premium /= 1.05; // 5% reduced for women
        }

        if (yearsWithoutDamage >= 3 && yearsWithoutDamage <= 5) {
            premium /= 1.15; // 15% reduction for 3 to 5 years without damage
        } else if (yearsWithoutDamage >= 6 && yearsWithoutDamage <= 8) {
            premium /= 1.25; // 25% reduction for 6 to 8 years without damage
        } else if (yearsWithoutDamage > 8) {
            premium /= 1.35; // 35% reduction for more than 8 years without damage
        }

        return premium;
    }
}
