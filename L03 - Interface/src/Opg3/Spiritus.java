package Opg3;

public class Spiritus extends Vare{
    private String navn;
    private String beskrivelse;

    public Spiritus(String navn, String beskrivelse) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }
    @Override
    public int price() {
        return super.price();
    }
}

