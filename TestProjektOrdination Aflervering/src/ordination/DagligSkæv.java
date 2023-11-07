package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DagligSkæv extends Ordination {

    private List<Dosis> dosis = new ArrayList<>();

    public DagligSkæv(LocalDate startDato, LocalDate slutDato) {
        super(startDato, slutDato);
    }

    public List<Dosis> getDosis() {
        return dosis;
    }
    public void opretDosis(LocalTime tid, double antal){
        Dosis d = new Dosis(tid, antal);
        dosis.add(d);
    }

    @Override
    public double samletDosis() {
        double sum = 0;
        if(!dosis.isEmpty()) {
            for (Dosis d : dosis) {
                sum += d.getAntal();
            }
        }
        return sum * antalDage();
    }


    @Override
    public double døgnDosis() {
        return samletDosis()/antalDage();
    }

    @Override
    public String getType() {
        return "Daglig Skæv";
    }
}
