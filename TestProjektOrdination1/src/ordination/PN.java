package ordination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class PN extends Ordination{
    private final double antalEnheder;
    private final List<LocalDate> anvendtDatoer = new ArrayList<>();

    public PN(LocalDate startDato, LocalDate slutDato, double antalEnheder) {
        super(startDato, slutDato);
        this.antalEnheder = antalEnheder;
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }

    /**
     * Registrer datoen for en anvendt dosis.
     */
    public void anvendDosis(LocalDate dato) {
        if (dato.isAfter(getStartDato().minusDays(1)) && dato.isBefore(getSlutDato().plusDays(1))){
            if (anvendtDatoer.isEmpty()){
                anvendtDatoer.add(dato);
            }
            else{
                boolean putPlace = false;
                int i = 0;
                while (!putPlace && i < anvendtDatoer.size()){
                    if (dato.isBefore(anvendtDatoer.get(i))){
                        anvendtDatoer.add(i,dato);
                        putPlace = true;
                    }
                    else if (i == (anvendtDatoer.size() - 1)) {
                        anvendtDatoer.add(i, dato);
                        putPlace = true;
                    }
                    i++;
                }
            }
        }
    }

    /** Returner antal gange ordinationen er anvendt. */
    public int antalGangeAnvendt() {
        return anvendtDatoer.size();
    }

    /** Returner den totale dosis, der er givet i den periode, ordinationen er gyldig. */
    @Override
    public double samletDosis() {
        return antalEnheder * anvendtDatoer.size();
    }

    @Override
    public double døgnDosis() {
        double dosis = 0;

        if (!anvendtDatoer.isEmpty()) {
            LocalDate startDatoTemp = anvendtDatoer.get(0);
            LocalDate slutDatoTemp = anvendtDatoer.get(anvendtDatoer.size() - 1);
            dosis = (antalGangeAnvendt() * antalEnheder) / (ChronoUnit.DAYS.between(startDatoTemp, slutDatoTemp) + 1);
        }
        return dosis;
    }

    @Override
    public String getType() {
        return "PN";
    }
}
