import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FamilyPaymentTest {
    @Test
    public void testOneChild() {
        FamilyPayment calculator = new FamilyPayment();
        int result = calculator.totalPayment(1, 0);
        assertEquals(2000, result);
    }

    @Test
    public void testTwoChildren() {
        FamilyPayment calculator = new FamilyPayment();
        int result = calculator.totalPayment(1, 1);
        assertEquals(2750, result);  // One child at full price, one with 25% discount
    }

    @Test
    public void testThreeChildren() {
        FamilyPayment calculator = new FamilyPayment();
        int result = calculator.totalPayment(2, 1);
        assertEquals(4250, result);  // One child at full price, two with 25% discount
    }

    @Test
    public void testFourChildren() {
        FamilyPayment calculator = new FamilyPayment();
        int result = calculator.totalPayment(2, 2);
        assertEquals(5000, result);  // Two children at full price, two with 50% discount
    }

    @Test
    public void testFiveChildren() {
        FamilyPayment calculator = new FamilyPayment();
        int result = calculator.totalPayment(3, 2);
        assertEquals(7000, result);  // Two children at full price, three with 50% discount
    }
}