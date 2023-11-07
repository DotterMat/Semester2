package Test;

import controller.Controller;
import ordination.DagligFast;
import ordination.Dosis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligSkævTest {

    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
        Controller.setStorage(storage);
    }

    @Test
    void opretDosis() {

        Dosis testCase1 = new Dosis(LocalTime.of(12,00),0);
        Dosis testCase2 = new Dosis(LocalTime.of(12,00),6);


        assertEquals(LocalTime.of(12,00), testCase1.getTid());
        assertEquals(0, testCase1.getAntal());

        assertEquals(LocalTime.of(12,00), testCase2.getTid());
        assertEquals(6, testCase2.getAntal());
    }

    @Test
    void samletDosis() {

        Dosis dl1_1 = new Dosis(LocalTime.of(9, 30), 0);
        Dosis dl1_2 = new Dosis(LocalTime.of(10, 30), 0);
        Dosis dl1_3 = new Dosis(LocalTime.of(13, 30), 0);
        Dosis dl1_4 = new Dosis(LocalTime.of(14, 30), 0);
        Dosis dl1_5 = new Dosis(LocalTime.of(19, 30), 0);
        Dosis dl1_6 = new Dosis(LocalTime.of(20, 30), 0);

        Dosis dosisListe1[] = {dl1_1, dl1_2, dl1_3, dl1_4, dl1_5,dl1_6};

        Dosis dl2_1 = new Dosis(LocalTime.of(9, 30), 1);
        Dosis dl2_2 = new Dosis(LocalTime.of(10, 30), 2);
        Dosis dl2_3 = new Dosis(LocalTime.of(13, 30), 0);
        Dosis dl2_4 = new Dosis(LocalTime.of(14, 30), 1);
        Dosis dl2_5 = new Dosis(LocalTime.of(19, 30), 1);
        Dosis dl2_6 = new Dosis(LocalTime.of(20, 30), 2);

        Dosis dosisListe2[] = {dl2_1, dl2_2, dl2_3, dl2_4,dl2_5,dl2_6};

        DagligFast df = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe1);
        DagligFast df2 = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe2);

        assertEquals(LocalDate.of(2023, 10, 30), df.getStartDato());
        assertEquals(LocalDate.of(2023, 11, 30), df.getSlutDato());
        assertEquals(0, df.samletDosis());
        assertEquals(224, df2.samletDosis());
    }

    @Test
    void døgnDosis() {

        Dosis dl1_1 = new Dosis(LocalTime.of(9, 30), 0);
        Dosis dl1_2 = new Dosis(LocalTime.of(10, 30), 0);
        Dosis dl1_3 = new Dosis(LocalTime.of(13, 30), 0);
        Dosis dl1_4 = new Dosis(LocalTime.of(14, 30), 0);
        Dosis dl1_5 = new Dosis(LocalTime.of(19, 30), 0);
        Dosis dl1_6 = new Dosis(LocalTime.of(20, 30), 0);

        Dosis dosisListe1[] = {dl1_1, dl1_2, dl1_3, dl1_4, dl1_5,dl1_6};

        Dosis dl2_1 = new Dosis(LocalTime.of(9, 30), 1);
        Dosis dl2_2 = new Dosis(LocalTime.of(10, 30), 2);
        Dosis dl2_3 = new Dosis(LocalTime.of(13, 30), 0);
        Dosis dl2_4 = new Dosis(LocalTime.of(14, 30), 1);
        Dosis dl2_5 = new Dosis(LocalTime.of(19, 30), 1);
        Dosis dl2_6 = new Dosis(LocalTime.of(20, 30), 2);

        Dosis dosisListe2[] = {dl2_1, dl2_2, dl2_3, dl2_4,dl2_5,dl2_6};

        DagligFast df = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe1);
        DagligFast df2 = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe2);

        assertEquals(0, df.samletDosis()/ dosisListe1.length);
        assertTrue(df2.døgnDosis()/ dosisListe2.length >1);
    }
}