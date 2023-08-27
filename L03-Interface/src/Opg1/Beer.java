package Opg1;

public class Beer implements Measurable {
    private String navn;
    private double alkoholProcent;

    public Beer(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
    }

    @Override
    public double getMeasure() {
        return alkoholProcent;
    }

    public static Measurable[] blackFridayMeal(Measurable[] chillies, Measurable[] beers) {
        Measurable beer_largest = beers[0];
        Measurable chillies_largest = chillies[0];

        for (int i = 0; i < chillies.length; i++) {
            if (chillies[i].getMeasure() > chillies_largest.getMeasure()) {
                chillies_largest = chillies[i];
            }
        }
        for (int j = 0; j < beers.length; j++) {
            if (beers[j].getMeasure() > beer_largest.getMeasure()) {
                beer_largest = beers[j];
            }
        }
        Measurable[] strongest = {chillies_largest, beer_largest};
        return strongest;
    }

    @Override
    public String toString() {
        return "Alkohol Procent: " + alkoholProcent;
    }
}

