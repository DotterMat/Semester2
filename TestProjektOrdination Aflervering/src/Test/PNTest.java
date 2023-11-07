package Test;

import controller.Controller;
import ordination.Dosis;
import ordination.Ordination;
import ordination.PN;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void anvendDosis() {

        PN pnOrdination1 = new PN(LocalDate.of(2023, 10, 25), LocalDate.of(2023, 11, 25), 3.0);
        assertEquals(0, pnOrdination1.getAnvendtDatoer().size());
        pnOrdination1.anvendDosis(LocalDate.of(2023, 11, 10));
        assertEquals(1, pnOrdination1.getAnvendtDatoer().size());

        PN pnOrdination2 = new PN(LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 25), 3.0);
        pnOrdination2.anvendDosis(LocalDate.of(2023, 11, 5));
        assertEquals(1, pnOrdination2.getAnvendtDatoer().size());
        pnOrdination2.anvendDosis(LocalDate.of(2023, 11, 10));
        assertEquals(2, pnOrdination2.getAnvendtDatoer().size());

        PN pnOrdination3 = new PN(LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 25), 3.0);
        pnOrdination3.anvendDosis(LocalDate.of(2023, 11, 5));
        assertEquals(1, pnOrdination3.getAnvendtDatoer().size());
        pnOrdination3.anvendDosis(LocalDate.of(2023, 11, 20));
        assertEquals(2, pnOrdination3.getAnvendtDatoer().size());
        pnOrdination3.anvendDosis(LocalDate.of(2023, 11, 10));
        assertEquals(3, pnOrdination3.getAnvendtDatoer().size());

        PN pnOrdination4 = new PN(LocalDate.of(2023, 11, 5), LocalDate.of(2023, 11, 20), 3.0);
        pnOrdination4.anvendDosis(LocalDate.of(2023, 11, 5));
        assertEquals(1, pnOrdination4.getAnvendtDatoer().size());
        pnOrdination4.anvendDosis(LocalDate.of(2023, 11, 20));
        assertEquals(2, pnOrdination4.getAnvendtDatoer().size());
        pnOrdination4.anvendDosis(LocalDate.of(2023, 11, 20));
        assertEquals(3, pnOrdination4.getAnvendtDatoer().size());
    }


    @Test
    void antalGangeAnvendt() {

        PN pnOrdination = new PN(LocalDate.of(2023, 10, 25), LocalDate.of(2023, 11, 25), 3.0);
        int antalGangeAnvendt = pnOrdination.antalGangeAnvendt();
        assertEquals(0, antalGangeAnvendt);
        PN pnOrdination1 = new PN(LocalDate.of(2023, 10, 25), LocalDate.of(2023, 11, 25), 3.0);
        for (int i = 0; i < 5; i++) {
            pnOrdination.anvendDosis(LocalDate.of(2023, 10, 25).plusDays(i));
        }
        int antalGangeAnvendt1 = pnOrdination.antalGangeAnvendt();
        assertEquals(5, antalGangeAnvendt1);
    }



    @Test
    void samletDosis() {

        PN pn = new PN(LocalDate.of(2023,10,30),LocalDate.of(2023,11,30),0);
        assertEquals(0,pn.samletDosis());


        PN pn2 = new PN(LocalDate.of(2023,10,25),LocalDate.of(2023,11,25),32);
        //assertTrue(pn2.getAntalEnheder()> pn2.samletDosis());
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,11,25));
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,11,25));
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,11,25));
        assertEquals(96,pn2.samletDosis());
    }

    @Test
    void døgnDosis() {
        PN pn = new PN(LocalDate.of(2023,10,30), LocalDate.of(2023,11,30),0);
        assertEquals(0,pn.døgnDosis());

        PN pn2 = new PN(LocalDate.of(2023,10,30), LocalDate.of(2023,11,30),3);
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,10,30));
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,11,1));
        Controller.anvendOrdinationPN(pn2,LocalDate.of(2023,11,8));
        assertEquals(0.9,pn2.døgnDosis());
    }
}