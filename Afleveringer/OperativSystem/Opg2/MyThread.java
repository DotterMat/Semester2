package Opg2;

public class MyThread extends Thread{
    private String name;
    private Faelles object;

    public MyThread(String name, Faelles object) {
        this.name = name;
        this.object = object;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            Main.setFlag(1,true);
            Main.setTurn(0);
            while (Main.getFlag(0) && Main.getTurn() == 0) {
                object.tagerRandomTid(100);
            }
            object.kritiskSektion();
            Main.setFlag(1, false);
            object.tagerRandomTid(200);
        }
        System.out.println(this.getClass().getSimpleName()+ "   " + object.getGlobalCounter());
    }
}
