package Test;

import java.time.LocalDate;

public class calculateFines {

    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        if (calculatedDate.isAfter(actualDate)) {
            // Calculated date is after the actual return date, no fine
            return 0;
        }

        // Calculate the number of days late by taking the difference between actualDate and calculatedDate
        int daysLate = (int) calculatedDate.datesUntil(actualDate).count();

        if (daysLate >= 1 && daysLate <= 7) {
            return adult ? 20 : 10;
        } else if (daysLate >= 8 && daysLate <= 14) {
            return adult ? 60 : 30;
        } else if (daysLate >= 15) {
            return adult ? 90 : 45;
        } else {
            // No fine for returning on time
            return 0;
        }
    }
}

