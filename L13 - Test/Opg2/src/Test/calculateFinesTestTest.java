package Test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class calculateFinesTestTest {
    @Test
    public void testCalculateFineForAdult() {
        LocalDate calculatedDate = LocalDate.of(2023, 10, 1); // Expected return date
        LocalDate actualDate = LocalDate.of(2023, 10, 1); // Actual return date (on time)
        boolean isAdult = true;

        calculateFines calculator = new calculateFines();
        int fine = calculator.calculateFine(calculatedDate, actualDate, isAdult);

        assertEquals(0, fine);
    }

    @Test
    public void testCalculateFineForChildOneDayLate() {
        LocalDate calculatedDate = LocalDate.of(2023, 10, 1); // Expected return date
        LocalDate actualDate = LocalDate.of(2023, 10, 2); // Actual return date (1 day late)
        boolean isAdult = false; // This is a child

        calculateFines calculator = new calculateFines();
        int fine = calculator.calculateFine(calculatedDate, actualDate, isAdult);

        assertEquals(10, fine);
    }

    @Test
    public void testCalculateFineForAdultFiveDaysLate() {
        LocalDate calculatedDate = LocalDate.of(2023, 10, 1);
        LocalDate actualDate = LocalDate.of(2023, 10, 6);
        boolean isAdult = true;

        calculateFines calculator = new calculateFines();
        int fine = calculator.calculateFine(calculatedDate, actualDate, isAdult);

        assertEquals(20, fine); // Corrected expected value
    }
}
