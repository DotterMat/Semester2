package MultiThreads;

public class MultithreadingThing implements Runnable{
    @Override
    public void run() {
       int randomTal = (int) (Math.random() * 100);
        boolean[] flag = new boolean[]{true};
        for (int i = 1; i <= randomTal; i++) {
            System.out.println(randomTal);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
