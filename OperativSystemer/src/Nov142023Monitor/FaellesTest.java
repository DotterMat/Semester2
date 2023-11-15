package Nov142023Monitor;

public class FaellesTest {
    public static void main(String[] args) {
        Faelles f1 = new Faelles();
        Tjener t1 = new Tjener(f1,1500);
        Tjener t2 = new Tjener(f1,1500);
        Kok k1 = new Kok(f1,1000);

        t1.start();
        t2.start();
        k1.start();

    }
}
