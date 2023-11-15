package Nov142023UdenSyncronized;

public class FaellesTest {
    public static void main(String[] args) {
        Faelles f1 = new Faelles();
        Tjener t1 = new Tjener(f1,1000);
        Tjener t2 = new Tjener(f1,1000);
        Kok k1 = new Kok(f1,1000);

        t1.start();
        t2.start();
        k1.start();

    }
}
