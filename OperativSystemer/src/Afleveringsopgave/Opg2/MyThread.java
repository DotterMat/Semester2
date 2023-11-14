package Afleveringsopgave.Opg2;

public class MyThread extends Thread{
    private String name;
    private Faelles object;

    public MyThread(String name, Faelles object) {
        this.name = name;
        this.object = object;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            Afleveringsopgave.Opg2.Main.setFlag(1,true);
            Afleveringsopgave.Opg2.Main.setTurn(0);
            while (Afleveringsopgave.Opg2.Main.getFlag(0) && Afleveringsopgave.Opg2.Main.getTurn() == 0) {
                object.tagerRandomTid(100);
            }
            object.kritiskSektion();
            Main.setFlag(1, false);
            object.tagerRandomTid(200);
        }
        System.out.println(this.getClass().getSimpleName()+ "   " + object.getGlobalCounter());
    }
}
