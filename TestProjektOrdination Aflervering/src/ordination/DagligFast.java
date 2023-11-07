package ordination;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DagligFast extends Ordination {
    private Dosis[] dosis = new Dosis[4];


    public DagligFast(LocalDate startDato, LocalDate slutDato, Dosis[] dosis) {
        super(startDato, slutDato);
        this.dosis = dosis;
    }

    public Dosis[] getDosis() {
        return dosis;
    }

    @Override
    public double samletDosis() {
      double sum = 0;
        for (int i = 0; i < dosis.length; i++) {
            sum += dosis[i].getAntal();
        }
        return sum * antalDage();
    }

    @Override
    public double døgnDosis() {
        return samletDosis()/antalDage();
    }
    @Override
    public String getType() {
        return "Daglig Fast";
    }
}


