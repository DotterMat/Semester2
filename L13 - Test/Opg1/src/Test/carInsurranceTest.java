package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ObjectStreamException;

import static org.junit.jupiter.api.Assertions.*;

class carInsurranceTest {
    @Test
    public void testCalculatePremium() {
        CarInsurrance carInsuranceObject = new CarInsurrance(200);
        assertEquals(1250.0, carInsuranceObject.calculatePremium(24, false, 0), 0.01); // TC2
        assertEquals(1000.0, carInsuranceObject.calculatePremium(25, false, 0), 0.01); // TC3
        assertEquals(807.5, carInsuranceObject.calculatePremium(0, true, 3), 0.01); // TC4
        assertEquals(937.5, carInsuranceObject.calculatePremium(24, false, 6), 0.01); // TC5
    }

    @Test
    public void testInvalidInput() {
        CarInsurrance carInsuranceObject = new CarInsurrance(200);

        // Testcases for invalid input
        assertThrows(RuntimeException.class, () -> carInsuranceObject.calculatePremium(17, false, 1)); // TC6
        assertThrows(RuntimeException.class, () -> carInsuranceObject.calculatePremium(25, false, -1)); // TC7
    }
}
