package Opg3;

public class MyThread2 extends Thread{
    private String name;
    private Faelles object;

    public MyThread2(String name, Faelles object) {
        this.name = name;
        this.object = object;
    }
    public void run() {
        for (int j = 0; j < 100; j++) {
            object.kritiskSektion();
            object.tagerRandomTid(100);
        }
        System.out.println(object.getGlobalCounter());
    }
}


