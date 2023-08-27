package Opg1;

public class Chili implements Measurable {

    private String navn;
    private int styrke;

    public Chili(String navn, int styrke) {

        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public int getStyrke() {
        return styrke;
    }

    @Override
    public double getMeasure() {
        if (styrke > 0 && styrke < 2000000) {
            return styrke;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Styrke på chilli: " + styrke;
    }
}
