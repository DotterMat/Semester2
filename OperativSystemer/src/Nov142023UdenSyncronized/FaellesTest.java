package Nov142023UdenSyncronized;

public class FaellesTest {
    public static void main(String[] args) {
        Faelles f1 = new Faelles();
        Tjener t1 = new Tjener(f1,20);
        Tjener t2 = new Tjener(f1,20);
        Kok k1 = new Kok(f1,10);

        t1.start();
        t2.start();
        k1.start();

    }
}
