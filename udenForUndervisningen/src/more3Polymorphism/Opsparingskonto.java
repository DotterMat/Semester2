package more3Polymorphism;

public class Opsparingskonto extends Konto{
    private int rente;
    public Opsparingskonto(String kontonummer, int rente) {
        super(kontonummer);
        this.rente = rente;
    }
    public void tilføjRente() {
       double rentetilføjelse = getSaldo() * rente;
       deponerePenge(rentetilføjelse);
    }
}
