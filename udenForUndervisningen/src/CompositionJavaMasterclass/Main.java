package CompositionJavaMasterclass;

public class Main {
    public static void main(String[] args) {
        ComputerCase c1 = new ComputerCase("2208", "Dell", "240");
        Monitor m1 = new Monitor("27inch", "Acer", 27, "1920 x 1080");
        Motherboard mo1 = new Motherboard("BJ-200", "Asus", 4, 6, "v2.55");
        PersonalComputer p1 = new PersonalComputer("2208", "Dell", c1, m1, mo1);

      /* p1.getMonitor().drawPixelAt(10,10,"red");
       p1.getMotherboard().loadProgram("Windows OS");
       p1.getComputerCase().pressPowerButtom();
       */
        p1.powerUp();
    }
}
