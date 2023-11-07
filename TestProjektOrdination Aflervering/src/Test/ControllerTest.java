package Test;

import ordination.*;
import controller.Controller;
import org.junit.jupiter.api.BeforeEach;
import storage.Storage;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private Storage storage;
   @BeforeEach
    void setUp() {
       storage = new Storage();
       Controller.setStorage(storage);
   }

    @Test
    void opretPNOrdination() {
        // arrange
        Patient jane = Controller.opretPatient("121256-0512","Jane Jensen",63.4);
        Lægemiddel acel = Controller.opretLægemiddel("Acetylsalicylsyre",0.1,0.15,0.16,"Styk");
        // act
        PN pn = Controller.opretPNOrdination(LocalDate.of(2023,10,30),LocalDate.of(2023,11,30), jane,acel,5);
        // assert
        assertEquals(LocalDate.of(2023,10,30),pn.getStartDato());
        assertEquals(LocalDate.of(2023,11,30),pn.getSlutDato());
        assertEquals(5,pn.getAntalEnheder());
        assertTrue(jane.getOrdinationer().contains(pn));
        assertEquals(acel,pn.getLægemiddel());

        // act and assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Controller.opretPNOrdination(LocalDate.of(2023,11,30),LocalDate.of(2023,10,30),jane,acel,5));
       assertEquals(exception.getMessage(),"Startdato kan ikke være efter slutdato.");

       // act
       PN pn2 = Controller.opretPNOrdination(LocalDate.of(2023,10,30),LocalDate.of(2023,10,30),jane,acel,5);
       //assert
        assertEquals(LocalDate.of(2023,10,30),pn2.getStartDato());
        assertEquals(LocalDate.of(2023,10,30),pn2.getSlutDato());
        assertEquals(5,pn2.getAntalEnheder());
        assertTrue(jane.getOrdinationer().contains(pn2));
        assertEquals(acel,pn2.getLægemiddel());
    }

    @Test
    void opretDagligFastOrdination() {
       //arrange
        Patient jane = Controller.opretPatient("121256-0512","Jane Jensen",63.4);
        Lægemiddel acel = Controller.opretLægemiddel("Acetylsalicylsyre",0.1,0.15,0.16,"Styk");

        LocalDate startDato = LocalDate.of(2023,10,30);
        LocalDate slutDato = LocalDate.of(2023,11,30);
        //act
        DagligFast dagligFast = Controller.opretDagligFastOrdination(startDato,slutDato,jane,acel,2,0,1,0);
        //assert
        assertEquals(startDato,dagligFast.getStartDato());
        assertEquals(slutDato,dagligFast.getSlutDato());
        assertTrue(jane.getOrdinationer().contains(dagligFast));
        assertEquals(acel,dagligFast.getLægemiddel());

        // act and assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Controller.opretDagligFastOrdination(LocalDate.of(2023,11,30),LocalDate.of(2023,10,30),jane,acel,2,0,1,0));
        assertEquals(exception.getMessage(),"Startdato kan ikke være efter slutdato");

        //act
        DagligFast dagligFast2 = Controller.opretDagligFastOrdination(LocalDate.of(2023,10,30),LocalDate.of(2023,10,30),jane,acel,2,0,1,0);

        //assert
        assertEquals(LocalDate.of(2023,10,30),dagligFast2.getStartDato());
        assertEquals(LocalDate.of(2023,10,30),dagligFast2.getSlutDato());
        assertTrue(jane.getOrdinationer().contains(dagligFast2));
        assertEquals(acel,dagligFast2.getLægemiddel());

    }

    @Test
    void opretDagligSkævOrdination() {
        //arrange
        Patient jane = Controller.opretPatient("121256-0512","Jane Jensen",63.4);
        Lægemiddel acel = Controller.opretLægemiddel("Acetylsalicylsyre",0.1,0.15,0.16,"Styk");
        LocalTime[] klokkeslet = new LocalTime[]{LocalTime.of(8,00),LocalTime.of(12,00),LocalTime.of(15,00),LocalTime.of(18,00)};
        double[] antalEnheder = new double[]{1,2,1,3};
        LocalDate startDato = LocalDate.of(2023,10,30);
        LocalDate slutDato = LocalDate.of(2023,11,30);
        //act
        DagligSkæv dagligSkæv = Controller.opretDagligSkævOrdination(startDato,slutDato, jane,acel,klokkeslet,antalEnheder);
        //assert
        assertEquals(startDato,dagligSkæv.getStartDato());
        assertEquals(slutDato,dagligSkæv.getSlutDato());
        assertTrue(jane.getOrdinationer().contains(dagligSkæv));
        assertEquals(acel,dagligSkæv.getLægemiddel());

        // act and assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Controller.opretDagligSkævOrdination(LocalDate.of(2023,11,30),LocalDate.of(2023,10,30),jane,acel,klokkeslet,antalEnheder));
        assertEquals(exception.getMessage(),"Startdato kan ikke være efter slutdato");

        //act
        DagligSkæv dagligSkæv2 = Controller.opretDagligSkævOrdination(LocalDate.of(2023,10,30),LocalDate.of(2023,10,30),jane,acel,klokkeslet,antalEnheder);

        //assert
        assertEquals(startDato,dagligSkæv2.getStartDato());
        assertEquals(LocalDate.of(2023,10,30),dagligSkæv2.getSlutDato());
        assertTrue(jane.getOrdinationer().contains(dagligSkæv2));
        assertEquals(acel,dagligSkæv2.getLægemiddel());

        // act and assert
        double[] foskelligAntalEnheder = new double[]{0,3,2,1};
        LocalTime[] forskelligKlokkeslet = new LocalTime[]{LocalTime.of(15,00),LocalTime.of(12,00),LocalTime.of(8,00)};
        Exception exception1 = assertThrows(IllegalArgumentException.class, () ->
                Controller.opretDagligSkævOrdination(startDato,slutDato,jane,acel,forskelligKlokkeslet,foskelligAntalEnheder));
                    assertEquals(exception1.getMessage(), "The number of time slots and units must be the same");
    }

    @Test
    void anvendOrdinationPN() {
        // arrange
        LocalDate startDato = LocalDate.of(2023,10,25);
        LocalDate slutDato = LocalDate.of(2023,11,25);
        PN pn = new PN(startDato,slutDato,5);

        pn.anvendDosis(LocalDate.of(2023, 10,26));
        pn.anvendDosis(LocalDate.of(2023,11,5));
        pn.anvendDosis(LocalDate.of(2023,11,15));

        LocalDate dato = LocalDate.of(2023,11,1);
        // act
        Controller.anvendOrdinationPN(pn, dato);
        // assert
        List<LocalDate> datoer = new ArrayList<>(List.of(
                LocalDate.of(2023, 10,26),
                LocalDate.of(2023,11,1),
                LocalDate.of(2023,11,5),
                LocalDate.of(2023,11,15)));
        assertTrue(pn.getAnvendtDatoer().contains(dato));
        assertEquals(datoer, pn.getAnvendtDatoer());

        //act and assert
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Controller.anvendOrdinationPN(pn, LocalDate.of(2023,10,10)));
        assertEquals(exception.getMessage(), "Den valgte dato ligger ikke indenfor ordinations gyldighedsperiode.");
    }

    @Test
    void anbefaletDosisPrDøgnNulKg() {
       // arrange - 0
       Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
              0.1,0.15,0.16,"Styk");
       Patient jane = new Patient("121256-0512","Jane Jensen", 0);
       // act
       double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
       // assert
       assertEquals(0,forventetDosis);
    }

    @Test
    void anbefaletDosisPrDøgnTyveKg(){
        // arrange - 20
        Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Patient jane = new Patient("121256-0512","Jane Jensen", 20);
        // act
        double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
        // assert
        assertEquals(2,forventetDosis);
    }

    @Test
    void anbefaletDosisPrDøgnFemOgTyveKg(){
        // arrange - 25
        Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Patient jane = new Patient("121256-0512","Jane Jensen", 25);
        // act
        double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
        // assert
        assertEquals(3.75,forventetDosis);
    }

    @Test
    void anbefaletDosisPrDøgnHalvfemsKg(){
        // arrange - 90
        Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Patient jane = new Patient("121256-0512","Jane Jensen", 90);
        // act
        double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
        // assert
        assertEquals(13.5,forventetDosis);
    }
    @Test
    void anbefaletDosisPrDøgnHundredTyveKg(){
        // arrange - 120
        Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Patient jane = new Patient("121256-0512","Jane Jensen", 120);
        // act
        double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
        // assert
        assertEquals(18,forventetDosis);
    }
    @Test
    void anbefaletDosisPrDøgnHundredHalvtredsKg(){
        // arrange - 150
        Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Patient jane = new Patient("121256-0512","Jane Jensen", 150);
        // act
        double forventetDosis = Controller.anbefaletDosisPrDøgn(jane, acetylsalicylsyre);
        // assert
        assertEquals(24,forventetDosis);
    }

    @Test
    void antalOrdinationerPrVægtPrLægemiddel() {
       // arrange
       Lægemiddel acetylsalicylsyre = new Lægemiddel("Acetylsalicylsyre",
                0.1,0.15,0.16,"Styk");
        Lægemiddel paracetamol = Controller.opretLægemiddel("Paracetamol",
                1, 1.5, 2, "Ml");
        Patient jane = Controller.opretPatient("121256-0512", "Jane Jensen", 63.4);
        Patient finn = Controller.opretPatient("070985-1153", "Finn Madsen", 83.2);
        Patient hans = Controller.opretPatient("050972-1233", "Hans Jørgensen", 89.4);
        Patient ulla = Controller.opretPatient("011064-1522", "Ulla Nielsen", 59.9);
        Patient ib = Controller.opretPatient("090149-2529", "Ib Hansen", 87.7);
        PN ordination1 = Controller.opretPNOrdination(LocalDate.parse("2019-02-12"),
                LocalDate.parse("2019-02-14"), jane, acetylsalicylsyre, 3);
        PN ordination2 = Controller.opretPNOrdination(LocalDate.parse("2019-03-12"),
                LocalDate.parse("2019-03-14"), finn, acetylsalicylsyre, 3);
        PN ordination3 = Controller.opretPNOrdination(LocalDate.parse("2019-04-12"),
                LocalDate.parse("2019-04-14"), hans, acetylsalicylsyre, 3);
        PN ordination4 = Controller.opretPNOrdination(LocalDate.parse("2019-05-12"),
                LocalDate.parse("2019-05-14"), ulla, acetylsalicylsyre, 3);
        PN ordination5 = Controller.opretPNOrdination(LocalDate.parse("2019-06-12"),
                LocalDate.parse("2019-06-14"), ib, acetylsalicylsyre, 3);
       //act
       int antalAlle = Controller.antalOrdinationerPrVægtPrLægemiddel(59,90,acetylsalicylsyre);
       //assert
       assertEquals(5,antalAlle);

        //act
        int antalNogenVægt = Controller.antalOrdinationerPrVægtPrLægemiddel(70,90,acetylsalicylsyre);
        //assert
        assertEquals(3,antalNogenVægt);

        //act
        int antalNogenMiddel = Controller.antalOrdinationerPrVægtPrLægemiddel(70,90,paracetamol);
        //assert
        assertEquals(0,antalNogenMiddel);
    }
}