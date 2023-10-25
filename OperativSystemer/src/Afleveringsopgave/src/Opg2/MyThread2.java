package Opg2;

public class MyThread2 extends Thread {
    private String name;
    private Faelles object;

    public MyThread2(String name, Faelles object) {
        this.name = name;
        this.object = object;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            Main.setFlag(0,true);
            Main.setTurn(1);
            while (Main.getFlag(1) && Main.getTurn() == 1) {
                object.tagerRandomTid(100);
            }
            object.kritiskSektion();
            Main.setFlag(0, false);
            object.tagerRandomTid(100);

        }
        System.out.println(this.getClass().getSimpleName()+ "   " + object.getGlobalCounter());

    }
}

