package Test;

import controller.Controller;
import ordination.DagligFast;
import ordination.Dosis;
import ordination.Ordination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DagligFastTest {

    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
        Controller.setStorage(storage);
    }

    @Test
    void samletDosis() {

        Dosis dl1_1 = new Dosis(LocalTime.of(8, 30), 0);
        Dosis dl1_2 = new Dosis(LocalTime.of(12, 30), 0);
        Dosis dl1_3 = new Dosis(LocalTime.of(18, 00), 0);
        Dosis dl1_4 = new Dosis(LocalTime.of(23, 59), 0);

        Dosis dosisListe1[] = {dl1_1, dl1_2, dl1_3, dl1_4};

        Dosis dl2_1 = new Dosis(LocalTime.of(8, 30), 1);
        Dosis dl2_2 = new Dosis(LocalTime.of(12, 00), 2);
        Dosis dl2_3 = new Dosis(LocalTime.of(18, 00), 0);
        Dosis dl2_4 = new Dosis(LocalTime.of(23, 59), 1);

        Dosis dosisListe2[] = {dl2_1, dl2_2, dl2_3, dl2_4};

        DagligFast df = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe1);
        DagligFast df2 = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe2);

        assertEquals(LocalDate.of(2023, 10, 30), df.getStartDato());
        assertEquals(LocalDate.of(2023, 11, 30), df.getSlutDato());
        assertEquals(0, df.samletDosis());
        assertEquals(128, df2.samletDosis());
    }

    @Test
    void døgnDosis() {

        Dosis dl1_1 = new Dosis(LocalTime.of(8, 30), 0);
        Dosis dl1_2 = new Dosis(LocalTime.of(12, 00), 0);
        Dosis dl1_3 = new Dosis(LocalTime.of(18, 00), 0);
        Dosis dl1_4 = new Dosis(LocalTime.of(23, 59), 0);

        Dosis dosisListe1[] = {dl1_1, dl1_2, dl1_3, dl1_4};

        Dosis dl2_1 = new Dosis(LocalTime.of(8, 30), 1);
        Dosis dl2_2 = new Dosis(LocalTime.of(12, 00), 2);
        Dosis dl2_3 = new Dosis(LocalTime.of(18, 00), 0);
        Dosis dl2_4 = new Dosis(LocalTime.of(23, 59), 1);

        Dosis dosisListe2[] = {dl2_1, dl2_2, dl2_3, dl2_4};

        DagligFast df = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe1);
        DagligFast df2 = new DagligFast(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 30), dosisListe2);

        assertEquals(0, df.samletDosis()/ dosisListe1.length);
        assertEquals(1,df2.døgnDosis()/ dosisListe2.length);
    }
}