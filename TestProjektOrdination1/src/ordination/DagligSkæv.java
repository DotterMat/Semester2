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
        return sum;
    }


    @Override
    public double døgnDosis() {
        double dosisPrDøgn = 0;
        double dosisIndenfor24Timer = 0;
        LocalTime startTid = dosis.get(0).getTid();

        for (int i = 0; i < dosis.size(); i++) {
            long timerMellemDoser = ChronoUnit.HOURS.between(startTid, dosis.get(i).getTid());
            if (timerMellemDoser < 24) {
                dosisIndenfor24Timer += dosis.get(i).getAntal();
            } else {
                dosisPrDøgn += dosisIndenfor24Timer;
                dosisIndenfor24Timer = dosis.get(i).getAntal();
                startTid = dosis.get(i).getTid();
            }
        }
        return dosisPrDøgn;

    }

    @Override
    public String getType() {
        return "Daglig Skæv";
    }
}
